import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(N));
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if(n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
