import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int dp[][] = new int[31][31];

        for (int i = 0; i < 31; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;

            if (i >= 1) {
                for (int j = 1; j < i; j++) {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            output.append(dp[M][N]).append("\n");
        }

        System.out.println(output);
    }
}
