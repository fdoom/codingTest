import java.util.*;

public class Solution {
    public Stack <Integer> solution(int []arr) {
        Stack <Integer> stack = new Stack<>();
        for(int n : arr) {
            if(stack.size() == 0) stack.add(n);
            else if(stack.get(stack.size() - 1) != n)
                stack.add(n);
        }

        return stack;
    }
}