import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1];
        
        for(int i = 2; i <= n; i++) {
            boolean flag = false;
            while(n % i == 0) {
                n /= i;
                flag = true;
            }
            if(flag) {
                answer[answer.length - 1] = i;
                answer = Arrays.copyOf(answer, answer.length + 1);
            }
        }
        answer = Arrays.copyOf(answer, answer.length - 1);
        return answer;
    }
}