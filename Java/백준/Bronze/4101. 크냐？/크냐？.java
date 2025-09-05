    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder output = new StringBuilder();

            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                if (A == 0 && B == 0) {
                    break;
                } else if (A <= B) {
                    output.append("No").append("\n");
                } else {
                    output.append("Yes").append("\n");
                }
            }
            System.out.println(output);
        }
    }
