import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[1];
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) <= '9' && my_string.charAt(i) >= '0') {
                answer[answer.length - 1] = (int)my_string.charAt(i) - '0';
                answer = Arrays.copyOf(answer, answer.length + 1);
            }
        }
        answer = Arrays.copyOf(answer, answer.length - 1);
        Arrays.sort(answer);
        return answer;
    }
}