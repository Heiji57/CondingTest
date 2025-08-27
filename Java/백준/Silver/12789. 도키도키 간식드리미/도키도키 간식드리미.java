import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int student = Integer.parseInt(st.nextToken());
            queue.add(student);
        }

        Stack<Integer> stack = new Stack<>();

        boolean flag = true;

        int i = 1;
        while (!queue.isEmpty()) {
            for (int j = 0; j <= queue.size(); j++) {
                if (queue.peek().equals(i)) {
                    queue.remove();
                    i++;
                    break;
                } else {
                    stack.push(queue.remove());
                }
            }

            while (!stack.isEmpty() && stack.peek().equals(i)) {
                stack.pop();
                i++;
            }
        }

        if (!stack.isEmpty()) {
            flag = false;
        }

        System.out.println(flag ? "Nice" : "Sad");
    }
}
