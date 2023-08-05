import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            Stack <String> stack = new Stack<>();
            for(String str : s.split("")) {
                if(stack.isEmpty())
                    stack.push(str);
                else if((str.equals("}") && stack.peek().equals("{")) || (str.equals(")") && stack.peek().equals("(")) || (str.equals("]") && stack.peek().equals("[")))
                    stack.pop();
                else stack.push(str);
            }
            if(stack.isEmpty())
                answer++;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
}