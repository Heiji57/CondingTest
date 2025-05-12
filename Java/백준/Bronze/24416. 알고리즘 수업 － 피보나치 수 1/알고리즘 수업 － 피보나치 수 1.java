import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fibonacci = new int[n+1];
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        for(int i = 3; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        System.out.print(fibonacci[n]+ " ");
        System.out.print(n-2);
    }
}