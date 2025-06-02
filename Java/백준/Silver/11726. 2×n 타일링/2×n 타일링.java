import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public BigInteger dpTable(int n) {
        if(n <= 2) return BigInteger.valueOf(n);

        BigInteger[] dp = new BigInteger[n + 1];
        dp[1] = BigInteger.valueOf(1);
        dp[2] = BigInteger.valueOf(2);
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Main dp = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dp.dpTable(n).mod(BigInteger.valueOf(10007)));
    }
}