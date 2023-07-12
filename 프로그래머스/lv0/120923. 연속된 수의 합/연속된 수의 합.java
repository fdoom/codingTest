import java.util.*;
class Solution {
    public ArrayList solution(int num, int total) {
        ArrayList <Integer> answer = new ArrayList<>();
        for(int i = -100; i < Integer.MAX_VALUE; i++) {
            int sum = 0;
            for(int j = i; j < i + num; j++) 
                sum += j;
            
            if(sum == total) {
                for(int j = i; j < i + num; j++)
                    answer.add(j);
                break;
            }
        }
        return answer;
    }
}