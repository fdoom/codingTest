import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = Arrays.stream(scoville)
            .boxed()
            .collect(Collectors.toCollection(PriorityQueue::new));

        int answer = 0;
        while(queue.peek() < K && queue.size() > 1) {
            queue.add(queue.remove() + queue.remove() * 2);
            answer++;
        }
        
        if(queue.peek() < K)
            answer = -1;

        return answer;
    }
}