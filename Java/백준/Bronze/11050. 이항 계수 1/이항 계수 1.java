import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long res = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println(res);
    }

    public static Long factorial(long f) {
        long fact = 1;
        for (int i = 1; i <= f; i++) {
            fact *= i;
        }
        return fact;
    }
}
