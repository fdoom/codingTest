import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i = arr[arr.length - 1]; i < Integer.MAX_VALUE; i++) {
            int cnt = 0;
            for(int n : arr) {
                if(i % n == 0)
                    cnt++;
            }
            if(cnt == arr.length) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}