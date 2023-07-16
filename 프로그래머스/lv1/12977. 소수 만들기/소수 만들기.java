import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        
        int len = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i = 2; i <= len; i++) {
            if(arr.isEmpty()) arr.add(i);
            else {
                boolean flag = true;
                for(int j = 0; j < arr.size(); j++) {
                    if(i % arr.get(j) == 0) {
                        flag = false;
                    }
                }
                if(flag) arr.add(i);
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(arr.contains(nums[i] + nums[j] + nums[k]))
                        answer++;
                }
            }
        }
        return answer;
    }
}