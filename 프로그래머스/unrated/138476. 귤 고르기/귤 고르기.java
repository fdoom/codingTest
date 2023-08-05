import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Integer[] sum = new Integer[10000001];
        Arrays.fill(sum, 0);
        for(int t : tangerine)
            sum[t]++;
        Arrays.sort(sum, Collections.reverseOrder());
        
        int cnt = 0;
        for(int s : sum) {
            cnt += s;
            answer++;
            if(cnt >= k)
                break;
        }
        return answer;
    }
}