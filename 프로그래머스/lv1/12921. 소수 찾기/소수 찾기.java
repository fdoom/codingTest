import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        
        for(int i = 2; i * i <= n; i++) {
            if(arr[i]) {
                for(int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for(boolean check : arr)
            if(check) answer++;
        return answer;
    }
}