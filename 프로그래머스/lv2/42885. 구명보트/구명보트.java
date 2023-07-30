import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] out = new boolean[people.length];
        Arrays.sort(people);
        
        int left = 0;
        for(int i = people.length - 1; i >= left; i--) {
            if(people[i] + people[left] <= limit)
                left++;
            answer++;
        }
        return answer;
    }
}