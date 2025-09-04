import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Ballon> ballons = new ArrayDeque<>();
        Deque<Integer> result = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            ballons.addLast(new Ballon(i+1, x));
        }

        while (!ballons.isEmpty()) {
            Ballon ballon = ballons.pollFirst();
            result.addLast(ballon.index);

            if (ballons.isEmpty()) break;

            int move = ballon.move;

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    ballons.addLast(ballons.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    ballons.addFirst(ballons.pollLast());
                }
            }
        }

        for (int ballon : result) {
            System.out.print(ballon + " ");
        }
    }

    public static class Ballon {
        int index;
        int move;
        Ballon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }
}

