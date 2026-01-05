import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        long queue1Sum = 0;
        long queue2Sum = 0;

        for (int queue : queue1) {
            que1.add(queue);
            queue1Sum += queue;
        } for (int queue : queue2) {
            que2.add(queue);
            queue2Sum += queue;
        }

        if (queue1Sum == queue2Sum) return 0;

        int cnt = 0;
        while (cnt <= (queue1.length + queue2.length) * 2 && !que1.isEmpty() && !que2.isEmpty()) {
            int num1 = que1.peek();
            int num2 = que2.peek();
            if(queue1Sum > queue2Sum) {
                que2.add(que1.poll());
                queue1Sum -= num1;
                queue2Sum += num1;
            } else {
                que1.add(que2.poll());
                queue2Sum -= num2;
                queue1Sum += num2;
            }

            cnt++;
            if (queue1Sum == queue2Sum) {
                return cnt;
            }
        }
        return -1;
    }
}