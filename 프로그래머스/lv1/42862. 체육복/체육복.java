import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        boolean[] check = new boolean[n + 1];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int l : lost) {
            for(int r : reserve) {
                if(l == r) {
                    check[r] = true;
                    answer++;
                    break;
                }
            }
        }
        
        for(int l : lost) {
            if(check[l]) continue;
            for(int r : reserve) {
                if(!check[r] &&(r - 1 == l || r + 1 == l)){
                    check[r] = true;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}