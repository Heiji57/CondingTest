import java.util.*;
/*
input : 
캐시 크기(cacheSize)와 도시이름 배열(cities)을 입력받는다.
cacheSize는 정수이며, 범위는 0 ≦ cacheSize ≦ 30 이다.
cities는 도시 이름으로 이뤄진 문자열 배열로, 최대 도시 수는 100,000개이다.
(각 도시 이름은 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다. 도시 이름은 최대 20자로 이루어져 있다.)

output :
입력된 도시이름 배열을 순서대로 처리할 때, "총 실행시간"을 출력

condition :
캐시 교체 알고리즘은 LRU(Least Recently Used)
cache hit일 경우 실행시간은 1
cache miss일 경우 실행시간은 5
*/

class Solution {
    public int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) return cities.length * 5;

        int result = 0;
        Deque<String> cache = new LinkedList<>();

        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) {
                result += 1;
                cache.remove(city);
                cache.addFirst(city);
            } else {
                cache.addFirst(city);
                result += 5;
                if (cacheSize < cache.size()) {
                    cache.removeLast();
                }
            }
        }
        return result;
    }
}