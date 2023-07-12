import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[1];
        for(int num : numlist) {
            if(num % n == 0) {
                answer[answer.length - 1] = num;
                answer = Arrays.copyOf(answer, answer.length + 1);
            }
        }
        answer = Arrays.copyOf(answer, answer.length - 1);
        return answer;
    }
}