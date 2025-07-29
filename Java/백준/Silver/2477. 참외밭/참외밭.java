import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dir = new int[6];
        int[] len = new int[6];

        int maxwidth = 0;
        int maxheight = 0;
        int maxwidthdepth = 0;
        int maxheightdepth = 0;

        int K = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            dir[i] = sc.nextInt();
            len[i] = sc.nextInt();

            if (dir[i] == 1 || dir[i] == 2) {
                if (maxwidth < len[i]) {
                    maxwidth = len[i];
                    maxwidthdepth = i;
                }
            } else if (dir[i] == 3 || dir[i] == 4) {
                if (maxheight < len[i]) {
                    maxheight = len[i];
                    maxheightdepth = i;
                }
            }
        }

        int smallwidthbox = len[(maxwidthdepth+3)%6];
        int smallheightbox = len[(maxheightdepth+3)%6];

        int area = (maxwidth * maxheight) - (smallwidthbox * smallheightbox);
        System.out.println(area*K);
    }
}
