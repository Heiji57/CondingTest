import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        long result = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (!(s.equals("ENTER")) && !set.contains(s)) result++;
            else if (s.equals("ENTER")) set.clear();
            set.add(s);
            
        }

        System.out.println(result);
    }
}
