import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> queue = new PriorityQueue<>();
        for(int s : scoville)
            queue.offer(s);
        while(queue.peek() < K && queue.size() > 1) {
            queue.offer(queue.poll() + queue.poll() * 2);
            answer++;
        }
        return queue.peek() >= K ? answer : -1;
    }
}