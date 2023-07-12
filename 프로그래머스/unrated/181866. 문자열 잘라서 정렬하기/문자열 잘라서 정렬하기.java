import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x+");
        Arrays.sort(answer);
        if(answer[0].isBlank()) answer = Arrays.copyOfRange(answer, 1, answer.length);
        return answer;
    }
}