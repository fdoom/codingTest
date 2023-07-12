import java.util.*;
class Solution {
    public ArrayList <Integer> solution(int[] arr, int divisor) {
        ArrayList <Integer> answer = new ArrayList<>();
        for(int n : arr) {
            if(n % divisor == 0)
                answer.add(n);
        }
        Collections.sort(answer);
        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}