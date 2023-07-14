import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] len = new int[2];
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] <  sizes[i][1]) {
                int swap = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = swap;
            }
        }
        for(int i = 0; i < sizes.length; i++) {
            len[0] = Math.max(len[0], sizes[i][0]);
            len[1] = Math.max(len[1], sizes[i][1]);
        }
        answer = len[0] * len[1];
        return answer;
    }
}