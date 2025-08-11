import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> calls = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int Y = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            calls.add(sc.nextInt());

            Y += ((calls.get(i) / 30) + 1) * 10;
            M += ((calls.get(i) / 60) + 1) * 15;
        }

        if (Y > M) {
            System.out.println("M " + M);
        } else if (Y < M) {
            System.out.println("Y " + Y);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}
