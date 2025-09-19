import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            sum += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        Collections.sort(list);

        // 산술평균
        int average = (int) Math.round(sum / (double) N);

        // 중앙값
        int middle = list.get(N / 2);

        // 최빈값
        int maxFreq = Collections.max(map.values());
        List<Integer> modeList = new ArrayList<>();
        for (var entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }
        Collections.sort(modeList);
        int mode = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0);

        // 범위
        int range = max - min;

        System.out.println(average);
        System.out.println(middle);
        System.out.println(mode);
        System.out.println(range);
    }
}
