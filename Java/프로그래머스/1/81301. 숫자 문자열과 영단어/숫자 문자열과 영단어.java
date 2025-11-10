class Solution {
    public int solution(String s) {
        String[] arr = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(arr[i], String.valueOf(i));
        }
        int res = Integer.parseInt(s);

        return res;
    }
}