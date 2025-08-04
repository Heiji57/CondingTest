import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int L = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            int mathDates = 0;
            int langageDates = 0;

            if (A%C == 0) {
                mathDates = A/C;
            } else if (!(A%C==0)) {
                mathDates = A/C+1;
            }

            if (B%D == 0) {
                langageDates = B/D;
            } else if (!(B%D==0)) {
                langageDates = B/D+1;
            }

            if (mathDates <= langageDates) {
                System.out.println(L - langageDates);
            } else {
                System.out.println(L - mathDates);
            }
        }
}
