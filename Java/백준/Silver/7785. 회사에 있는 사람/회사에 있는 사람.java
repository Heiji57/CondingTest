import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        HashSet<String> people = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String action = sc.next();

            if (action.equals("enter")) {
                people.add(name);
            } else if (action.equals("leave")) {
                people.remove(name);
            }
        }

        List<String> peopleList = new ArrayList<>(people);

        Collections.sort(peopleList, Collections.reverseOrder());

        for (String name : peopleList) {
            System.out.println(name);
        }

    }
}
