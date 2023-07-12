import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int len = 0;
        for(long i = x; i < Long.MAX_VALUE; i += x) {
            answer[len++] = i;
            if(len == n) break;
        }
        return answer;
    }
}