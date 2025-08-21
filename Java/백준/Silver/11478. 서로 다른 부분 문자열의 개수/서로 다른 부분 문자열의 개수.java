import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++) {
                set.add(S.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}
