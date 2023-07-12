import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] temp = emergency.clone();
        Arrays.sort(temp);
        
        int[] answer = new int[emergency.length];
        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(temp[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                    break;
                }
            }
        }
        return answer;
    }
}