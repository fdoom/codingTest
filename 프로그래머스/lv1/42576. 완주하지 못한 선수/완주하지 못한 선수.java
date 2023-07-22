import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                System.out.println(participant[i] + " " + completion[i]);
                answer = participant[i];
                break;
            }
        }
        
        if(answer.isBlank())
            answer = participant[participant.length - 1];
        return answer;
    }
}