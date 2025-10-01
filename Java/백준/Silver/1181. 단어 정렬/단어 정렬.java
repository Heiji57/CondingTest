import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            set.add(s);
        }
        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (Comparator<String>) (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return Integer.compare(o1.length(), o2.length());
            }
            return o1.compareTo(o2);
        });


        for (String s : list) {
            output.append(s).append("\n");
        }
        System.out.println(output);
    }
}
