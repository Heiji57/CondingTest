import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] leftHand = {0, 3}, rightHand = {2, 3};

        // 맨헤튼 거리 공식 사용: |x1 - x2| + |y1 - y2|
        // 숫자 자판을 만든다고 생각하지 말고 숫자를 받을 때마다 그 숫자에 맞는 2차원 배열 인덱스를 만든다고 생각하셈.
        for (int number : numbers) {
            int[] pos = getCoordinate(number);

            if (number % 3 == 1) {
                leftHand = pos;
                sb.append("L");
            } else if (number % 3 == 0 && number != 0) {
                rightHand = pos;
                sb.append("R");
            } else {
                int rightDistance = getDistance(pos, rightHand);
                int leftDistance = getDistance(pos, leftHand);
                if (leftDistance < rightDistance) {
                    leftHand = pos;
                    sb.append("L");
                } else if (rightDistance < leftDistance) {
                    rightHand = pos;
                    sb.append("R");
                } else {
                    if (hand.equals("left")) {
                        leftHand = getCoordinate(number);
                        sb.append("L");
                    } else {
                        rightHand = getCoordinate(number);
                        sb.append("R");
                    }
                }
            }
        }
        return sb.toString();
    }
    
    public static int getDistance(int[] p1, int[] p2) {
        int x1 = p1[0], y1 = p1[1], x2 = p2[0], y2 = p2[1];

        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static int[] getCoordinate(int num) {
        if (num == 0) return new int[]{1, 3};
        if (num == -1) return new int[]{0, 3};
        if (num == -2) return new int[]{2, 3};

        int row = (num - 1) / 3;
        int col = (num - 1) % 3;

        return new int[]{col, row};
    }
}