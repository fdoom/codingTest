import java.util.*;
class Solution {
    public List <Integer> solution(int[] progresses, int[] speeds) {
        List <Integer> answer = new ArrayList<>();
        while(progresses.length > 0) {
            for(int i = 0; i < progresses.length; i++)
                progresses[i] += speeds[i];
            
            int cnt = 0;
            while(progresses.length > 0 && progresses[0] >= 100) {
                cnt++;
                progresses = Arrays.copyOfRange(progresses, 1, progresses.length);
                speeds = Arrays.copyOfRange(speeds, 1, speeds.length);
            }
            if(cnt > 0)
                answer.add(cnt);
        }
        return answer;
    }
}