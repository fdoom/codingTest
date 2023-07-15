import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        ArrayList <Character> n = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(n.lastIndexOf(s.charAt(i)) == -1) {
                n.add(s.charAt(i));
                answer[i] = -1;
            }
            else {
                answer[i] = i - n.lastIndexOf(s.charAt(i));
                n.add(s.charAt(i));
            }
        }
        return answer;
    }
}