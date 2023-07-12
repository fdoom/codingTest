import java.util.*;
class Solution {
    public ArrayList <Integer> solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(arr);
        ArrayList <Integer> answer = new ArrayList<>();
        for(int n : temp) {
            if(n != arr[0])
                answer.add(n);
        }
        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}