import java.util.*;
class Solution {
    static boolean[] check;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(check[i]) continue;
            DFS(n, computers, i);
            answer++;
        }
        return answer;
    }
    
    void DFS(int n, int[][] computers, int index) {
        if(index >= n) return;
        for(int i = 0; i < n; i++) {
            if(!check[i] && computers[index][i] == 1) {
                check[i] = true;
                DFS(n, computers, i);
            }
        }
    }
}