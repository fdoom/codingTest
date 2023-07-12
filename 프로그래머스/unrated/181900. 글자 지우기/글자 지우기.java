import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        
        int temp = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(temp < indices.length && indices[temp] == i) {
                temp++;
                continue;
            }
            answer += "" + my_string.charAt(i);
        }
        return answer;
    }
}