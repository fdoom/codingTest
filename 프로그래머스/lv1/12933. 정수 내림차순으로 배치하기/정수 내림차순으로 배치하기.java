import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String [] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String s = "";
        for(String temp : arr)
            s += temp;
        answer = Long.valueOf(s);
        return answer;
    }
}