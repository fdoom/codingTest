import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for(int i = 0; i <= citations[citations.length - 1]; i++) {
            int cnt = 0;
            for(int j = 0; j < citations.length; j++)
                if(i <= citations[j])
                    cnt++;
            if(cnt >= i)
                answer = i;
        }
        return answer;
    }
}