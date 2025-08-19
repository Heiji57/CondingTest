import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                result.add(s);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
