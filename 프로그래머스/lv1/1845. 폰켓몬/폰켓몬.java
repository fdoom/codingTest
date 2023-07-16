import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList <Integer> type = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(type.indexOf(nums[i]) == -1) {
                type.add(nums[i]);
            }
        }
        if(type.size() >= nums.length / 2)
            answer = nums.length / 2;
        else
            answer = type.size();
        return answer;
    }
}