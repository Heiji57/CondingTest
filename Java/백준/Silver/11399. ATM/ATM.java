import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int sum = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            sum += list.get(i);
            result += sum;
        }
        System.out.println(result);
    }
}
