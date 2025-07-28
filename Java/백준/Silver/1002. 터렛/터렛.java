import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
            int result = 0;

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                result = -1;
            } else if (Math.abs(d - (r1 + r2)) < 1e-6 || Math.abs(d - Math.abs(r2 - r1)) < 1e-6 ) {
                result = 1;
            } else if (Math.abs(r1-r2) < d && d < r1+r2) {
                result = 2;
            } else result = 0;

            System.out.println(result);
        }
    }
}
