import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int Using = 1;
        int maxCutting = 0;
        int cutting = 1;

        for (int i = 0; i < N-1; i++) {
            if (list.get(i) <= list.get(i+1)) {
                cutting++;
            } else {
                maxCutting = Math.max(maxCutting, cutting);
                cutting = 1;
                Using++;
            }

        }
        maxCutting = Math.max(maxCutting, cutting);

        System.out.println(Using + " " + maxCutting);
    }
}
