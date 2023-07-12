import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() / n + 1];
        int index = 0;
        for(int i = 0; i < my_str.length(); i += n) {
        	if(i + n < my_str.length())
        		answer[index++] = my_str.substring(i, i + n);
        	else
        		answer[index++] = my_str.substring(i, my_str.length());
        }
        if(answer[answer.length - 1] == null)
        	answer = Arrays.copyOf(answer, answer.length - 1);
        return answer;
    }
}