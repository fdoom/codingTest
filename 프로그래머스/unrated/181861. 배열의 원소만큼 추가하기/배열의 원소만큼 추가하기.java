import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int n : arr)
            sum += n;
        int[] answer = new int[sum];
        
        int start = 0;
        for(int i = 0; i < arr.length; i++) {
            Arrays.fill(answer, start, arr[i] + start, arr[i]);
            start += arr[i];
        }
        return answer;
    }
}