import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] p = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] cnt = new int[3];
        int max = 0;
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < p.length; j++) {
                if(p[j][i % p[j].length] == answers[i]) {
                    cnt[j]++;
                    max = Math.max(cnt[j], max);
                }
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(a -> a).toArray();
    }
}