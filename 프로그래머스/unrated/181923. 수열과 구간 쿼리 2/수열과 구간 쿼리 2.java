import java.util.*;

class Solution {
    public ArrayList <Integer> solution(int[] arr, int[][] queries) {
        ArrayList <Integer> answer = new ArrayList <Integer> ();
        for(int j = 0; j < queries.length; j++) {
            int n = Integer.MAX_VALUE;
            for(int i = queries[j][0]; i <= queries[j][1]; i++) {
                if(arr[i] > queries[j][2]) {
                    n = n > arr[i] ? arr[i] : n;
                }
            }
            if(n == Integer.MAX_VALUE) n = -1;
            answer.add(n);
        }
        return answer;
    }
}