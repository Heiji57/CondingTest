import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push": {
                    int number = Integer.parseInt(st.nextToken());
                    queue.add(number);
                    break;
                } case "pop": {
                    if (queue.isEmpty()) output.append(-1).append("\n");
                    else output.append(queue.poll()).append("\n");
                    break;
                } case "size": {
                    output.append(queue.size()).append("\n");
                    break;
                } case "empty": {
                    if (queue.isEmpty()) output.append(1).append("\n");
                    else output.append(0).append("\n");
                    break;
                } case "front": {
                    if (queue.isEmpty()) output.append(-1).append("\n");
                    else output.append(queue.peek()).append("\n");
                    break;
                } case "back": {
                    if (queue.isEmpty()) output.append(-1).append("\n");
                    else output.append(queue.peekLast()).append("\n");
                    break;
                } default: {
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
