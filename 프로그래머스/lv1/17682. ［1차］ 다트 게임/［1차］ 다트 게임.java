import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack <Integer> stack = new Stack<>();
        String[] s1 = dartResult.split("[^0-9]+");
        String[] s2 = dartResult.split("[0-9]+");
        
        for(int i = 0; i < s1.length; i++) {
            int num = Integer.parseInt(s1[i]);
            int index = i + 1;
            while(!s2[index].isBlank()) {
                if(s2[index].matches("S(.*)"))
                    stack.push(num);
                else if(s2[index].matches("D(.*)")) {
                    num *= num;
                    stack.push(num);
                }
                else if(s2[index].matches("T(.*)")) {
                    num *= num * num;
                    stack.push(num);
                }
                else if(s2[index].matches("#(.*)")) {
                    stack.push(stack.pop() * -1);
                }
                else {
                    if(stack.size() >= 2) {
                        int temp1 = stack.pop() * 2;
                        int temp2 = stack.pop() * 2;
                        stack.push(temp2);
                        stack.push(temp1);
                    }
                    else {
                        stack.push(stack.pop() * 2);
                    }
                }
                s2[index] = s2[index].substring(1);
            }
        }
        while(!stack.isEmpty())
            answer += stack.pop();
        return answer;
    }
}