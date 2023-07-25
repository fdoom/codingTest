import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        List <String> type = new ArrayList(List.of("R", "T", "C", "F", "J", "M", "A", "N"));
        int[] sum = new int[type.size()];
        
        for(int i = 0; i < survey.length; i++) {
            String a = survey[i].substring(0, 1);
            String b = survey[i].substring(1, 2);
            
            switch(choices[i]) {
                case 1: case 2: case 3:
                    sum[type.indexOf(a)] += 4 - choices[i];
                    break;
                case 5: case 6: case 7:
                    sum[type.indexOf(b)] += choices[i] - 4;
                    break;
            }
        }
        
        for(int i = 0; i < sum.length ; i += 2) {
            if(sum[i] < sum[i + 1])
                answer += type.get(i + 1);
            else
                answer += type.get(i);
        }
        return answer;
    }
}