import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue <Integer> progressesQueue = Arrays.stream(progresses)
            .boxed()
            .collect(Collectors.toCollection(ArrayDeque::new));
        
        Queue <Integer> speedsQueue = Arrays.stream(speeds)
            .boxed()
            .collect(Collectors.toCollection(ArrayDeque::new));
        
        Queue<Integer> answer = new ArrayDeque<>();
        
        while (!progressesQueue.isEmpty()) {
            for (int i = 0; i < progressesQueue.size(); i++) {
                int updatedProgress = progressesQueue.remove() + speedsQueue.peek();
                progressesQueue.add(updatedProgress);
                speedsQueue.add(speedsQueue.remove());
            }

            int count = 0;
            while (!progressesQueue.isEmpty() && progressesQueue.peek() >= 100) {
                progressesQueue.remove();
                speedsQueue.remove();
                count++;
            }

            if (count > 0)
                answer.add(count);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}