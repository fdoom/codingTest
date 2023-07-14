import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack <String> s = new Stack<>();
        for(int i = 0; i < words.length; i++) {
            if(i % n == 0) answer[1]++;
            
            if(s.isEmpty()) s.push(words[i]);
            else if(s.indexOf(words[i]) != -1 || words[i].length() == 1 ||
                   s.peek().charAt(s.peek().length() - 1) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                break;
            }
            else s.push(words[i]);
            
            if(i + 1 == words.length) answer[1] = 0;
        }
        return answer;
    }
}