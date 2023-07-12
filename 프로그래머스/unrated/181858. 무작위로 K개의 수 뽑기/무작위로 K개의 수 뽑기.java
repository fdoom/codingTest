import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        for(int n : arr) {
            for(int i = 0; i < answer.length; i++) {
                if(n == answer[i]) break;
                if(answer[i] == -1) {
                    answer[i] = n;
                    break;
                }
            }
        }
        return answer;
    }
}