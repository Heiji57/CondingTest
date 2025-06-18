class Solution {
    public String solution(String polynomial) {
        int cnt = 0;
        int temp = 0;
        String str[] = polynomial.split(" ");
        for (String s : str) {
            if(s.equals("+")) continue;

            if(s.contains("x")) {
                String con = s.replace("x", "");

                if(con.equals("")) {
                    cnt++;
                } else {
                    cnt+=Integer.parseInt(con);
                }
            } else {
                temp += Integer.parseInt(s);
            }
        }
        String answer;
        if(cnt == 1&&temp==0) answer = ("x");
        else if(temp == 0) answer = (cnt + "x");
        else if(cnt == 1) answer = ("x" + " + " + temp);
        else if(cnt <= 0) answer = (""+temp);
        else answer = (cnt + "x" + " + " + temp);
        
        return answer;
    }
}