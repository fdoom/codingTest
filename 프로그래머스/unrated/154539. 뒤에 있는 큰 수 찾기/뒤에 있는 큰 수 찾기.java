import java.util.Stack;
class Solution {
    public static int[] solution(int[] numbers) {
		Stack <Integer> stack = new Stack<>();
		int[] answer = new int[numbers.length];
        
        for(int i = numbers.length - 1; i >= 0; i--) {
            while(!stack.isEmpty()) {
                if(stack.peek() > numbers[i]) {
                    answer[i] = stack.peek();
                    break;
                }
                else stack.pop();
            }
            if(stack.isEmpty())
                answer[i] = -1;
            
            stack.push(numbers[i]);
        }
        return answer;
    }
}