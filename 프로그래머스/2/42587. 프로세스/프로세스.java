import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue <Integer> prioritiesQueue = Arrays.stream(priorities)
            .boxed()
            .collect(Collectors.toCollection(LinkedList::new));
        
        Queue <Integer> indexQueue = new LinkedList<>();
        TreeMap <Integer, Integer> maxValue = new TreeMap<>((a, b) -> b - a);
        for(int i = 0; i < priorities.length; i++) {
            indexQueue.add(i);
            maxValue.put(priorities[i], maxValue.getOrDefault(priorities[i], 0) + 1);
        }
        
        int cnt = 0;
        int answer = -1;
        
        while(!maxValue.isEmpty() && answer == -1) {
            int max = maxValue.firstKey();
            for(int i = 0; i < prioritiesQueue.size(); i++) {
                if(max == prioritiesQueue.peek()) {
                    cnt++;
                    if(indexQueue.peek() == location) {
                        answer = cnt;
                        break;
                    }
                
                    prioritiesQueue.remove();
                    indexQueue.remove();
                    maxValue.put(max, maxValue.get(max) - 1);
                    if(maxValue.get(max) == 0) {
                        maxValue.remove(max);
                        max = maxValue.firstKey();
                    }
                }
                else {
                    prioritiesQueue.add(prioritiesQueue.remove());
                    indexQueue.add(indexQueue.remove());
                }
            }
        }
        return answer;
    }
}