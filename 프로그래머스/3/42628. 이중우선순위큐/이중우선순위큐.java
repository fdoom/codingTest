import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue <Integer> max = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue <Integer> min = new PriorityQueue<>();
        
        for(String operation : operations) {
            int num = Integer.parseInt(operation.substring(2));
            if(operation.charAt(0) == 'I') {
                max.add(num);
                min.add(num);
            } else {
                if(num == -1 && !min.isEmpty()) {
                    max.remove(min.remove());
                }
                else if(num == 1 && !max.isEmpty()){
                    min.remove(max.remove());
                }
            }
        }
        
        int[] answer = new int[2];
        
        if(!max.isEmpty()) {
            answer[0] = max.remove();
            answer[1] = min.remove();
        }
        return answer;
    }
}