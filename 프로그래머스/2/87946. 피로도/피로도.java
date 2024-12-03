import java.util.*;

class Solution {
    static boolean[] check;
    static int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        DFS(k, dungeons, 0);
        return answer;
    }
    
    // 깊이 우선 탐색
    void DFS(int k, int[][] d, int deep) {
        answer = Math.max(answer, deep);
        
        for (int i = 0; i < d.length; i++) {
            if (!check[i] && k >= d[i][0]) {    // 탐험하지않은 던전 중 탐험 가능한 던전인 경우
                check[i] = true;                // 탐험 처리
                DFS(k - d[i][1], d, deep + 1);
                check[i] = false;               // 탐험 비처리
            }
        }
    }
}