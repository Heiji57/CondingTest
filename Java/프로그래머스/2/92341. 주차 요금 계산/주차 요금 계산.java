/*
주차장의 요금표와 차량이 들어오고(입차) 나간(출차) 기록이 주어졌을 때, 차량별로 주차 요금을 계산

조건 : 
어떤 차량이 입차된 후에 출차된 내역이 없다면, 23:59에 출차된 것으로 간주
00:00부터 23:59까지의 입/출차 내역을 바탕으로 차량별 누적 주차 시간을 계산하여 요금을 일괄로 정산
누적 주차 시간이 기본 시간이하라면, 기본 요금을 청구
누적 주차 시간이 기본 시간을 초과하면, 기본 요금에 더해서, 초과한 시간에 대해서 단위 시간 마다 단위 요금을 청구
    (기본 요금) + ((누적 주차 시간) - (기본 주차 시간)) / (단위 시간) * (단위 요금) 
    초과한 시간이 단위 시간으로 나누어 떨어지지 않으면, 올림
    
주차 요금을 나타내는 정수 배열 fees
자동차의 입/출차 내역을 나타내는 문자열 배열 records

fees의 길이 = 4
fees[0] = 기본 시간(분)
1 ≤ fees[0] ≤ 1,439
fees[1] = 기본 요금(원)
0 ≤ fees[1] ≤ 100,000
fees[2] = 단위 시간(분)
1 ≤ fees[2] ≤ 1,439
fees[3] = 단위 요금(원)
1 ≤ fees[3] ≤ 10,000

records의 각 원소는 시각 차량번호 내역 형식의 문자열
"05:34 5961 IN"

풀이 : 
records에서 IN 이 들어오면 HashSet에 추가 -> OUT 시 HashSet에서 삭제 후 HashMap에 key = 차량 번호 value = 누적 주차 시간 으로 저장. records의 정보를 모두 받았을 시 result 배열에 값 추가
*/
import java.util.*;

class Solution {
    int fullTime = 23 * 60 + 59;
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> chargeMap = new TreeMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            String car = parts[1], type = parts[2];
            int min = fullTime - timeToMin(parts[0]);

            chargeMap.merge(car, type.equals("IN") ? min : -min, Integer::sum);
        }
        
        return chargeMap.values()
            .stream()
            .mapToInt(min -> calculator(min, fees))
            .toArray();
    }
    
    public int calculator(int min, int[] fees) {
        if (min <= fees[0]) return fees[1];
        return fees[1] + (int) Math.ceil((min - fees[0]) / (double) fees[2]) * fees[3];
    }

    public int timeToMin(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]), minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}