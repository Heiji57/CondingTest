import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int t = 0; t < T; t++) {
            int a = sc.nextInt(); // 밑
            int b = sc.nextInt(); // 지수

            int base = a % 10; // 마지막 자리 숫자만 보면 됨
            int result = 0;

            if (base == 0) result = 10; // 10의 배수는 무조건 10번 컴퓨터
            else {
                // 각 숫자마다 나오는 패턴 저장
                int[] pattern;

                switch (base) {
                    case 1: pattern = new int[]{1}; break;
                    case 2: pattern = new int[]{2, 4, 8, 6}; break;
                    case 3: pattern = new int[]{3, 9, 7, 1}; break;
                    case 4: pattern = new int[]{4, 6}; break;
                    case 5: pattern = new int[]{5}; break;
                    case 6: pattern = new int[]{6}; break;
                    case 7: pattern = new int[]{7, 9, 3, 1}; break;
                    case 8: pattern = new int[]{8, 4, 2, 6}; break;
                    case 9: pattern = new int[]{9, 1}; break;
                    default: pattern = new int[]{10}; break;
                }

                // b % 패턴길이 - 1 (인덱스 보정)
                int idx = (b - 1) % pattern.length;
                result = pattern[idx];
            }

            System.out.println(result);
        }

        sc.close();
    }
}
