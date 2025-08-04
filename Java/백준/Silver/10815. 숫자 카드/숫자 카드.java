import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> cardsSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            cardsSet.add(sc.nextInt());
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            if (cardsSet.contains(sc.nextInt())) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
