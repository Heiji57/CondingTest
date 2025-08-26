import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S;
        while (!(S = br.readLine()).equals(".")) {

            Stack<Character> stack = new Stack<>();
            boolean valid = true;

            for (char c : S.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') { valid = false; break; }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') { valid = false; break; }
                }
            }
            if (!stack.isEmpty()) valid = false;
            System.out.println(valid ? "yes" : "no");
        }

    }
}
