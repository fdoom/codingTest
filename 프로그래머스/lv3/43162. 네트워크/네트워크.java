import java.util.*;
class Solution {
    static boolean[] check;
    static int cnt = 0;
    public int solution(int n, int[][] computers) {
        int answer = n;
        check = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(check[i]) continue;
            cnt = 0;
            DFS(n, computers, i);
            answer -= cnt + 1;
        }
        return answer *  -1;
    }
    
    void DFS(int n, int[][] computers, int deep) {
        if(deep >= n) return;
        for(int i = 0; i < n; i++) {
            if(!check[i] && computers[deep][i] == 1) {
                check[i] = true;
                cnt++;
                DFS(n, computers, i);
            }
        }
    }
}