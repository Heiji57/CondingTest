import java.util.*;

class Solution {
    static int[] res = { -1 };
    static int[] apeach;
    static int maxDiff = -1;
    public int[] solution(int n, int[] info) {
        res = new int[]{-1};
        maxDiff = -1;
        apeach = info;
        
        dfs(0, n, new int[11]);
        
        return res;
    }
    
    public void dfs(int idx, int left, int[] ryan) {
        if (idx == 11) {
            if (left > 0) ryan[10] += left;
            calcDiff(ryan);
            if (left > 0) ryan[10] -= left;
            return;
        }
        
        int arrowNeeded = apeach[idx] + 1;
        if (left >= arrowNeeded) {
            ryan[idx] = arrowNeeded;
            dfs(idx + 1, left - arrowNeeded, ryan);
            ryan[idx] = 0;
        }
        
        dfs(idx + 1, left, ryan);
    }
    
    public void calcDiff(int[] ryan) {
        int rScore = 0;
        int aScore = 0;
        
        for (int i = 0; i < 11; i++) {
            if (apeach[i] == 0 && ryan[i] == 0) continue;
            if (ryan[i] > apeach[i]) rScore += (10 - i);
            else aScore += (10 - i);
        }
        
        int diff = rScore - aScore;
        
        if (diff > 0) {
            if (maxDiff < diff) {
                maxDiff = diff;
                res = ryan.clone();
            }
            else if (maxDiff == diff) {
                if (isBetter(ryan)) {
                    res = ryan.clone();
                }
            }
        }
    }
    
    public boolean isBetter(int[] ryan) {
        for (int i = 10; i >= 0; i--) {
            if (ryan[i] > res[i]) return true;
            if (ryan[i] < res[i]) return false;
        }
        return false;
    }
}