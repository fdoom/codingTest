import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> truckQueue = Arrays.stream(truck_weights)
            .boxed()
            .collect(Collectors.toCollection(LinkedList::new));
        
        Queue<Integer> bridge = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++)
            bridge.add(0);
        
        int answer = 0;
        int cnt = 0;
        while(!truckQueue.isEmpty()) {
            answer++;
            cnt -= bridge.remove();
            
            if(bridge.size() < bridge_length && truckQueue.peek() + cnt <= weight) {
                int nextTruck = truckQueue.remove();
                cnt += nextTruck;
                bridge.add(nextTruck);
            } else {
                bridge.add(0);
            }
        }
        return answer + bridge_length;
    }
}