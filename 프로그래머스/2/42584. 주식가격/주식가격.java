import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < prices.length; i++) {
            int cnt = 0;
            for(int j = i + 1; j < prices.length; j++) {
                cnt++;
                if(prices[j] - prices[i] < 0)
                    break;
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}