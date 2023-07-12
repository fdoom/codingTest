import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] temp = s.split(" ");
        int[] num = new int[1];
        for(String t : temp) {
            if(t.equals("Z")) {
            	num = Arrays.copyOf(num, num.length - 2);
            	num = Arrays.copyOf(num, num.length + 1);
            }
            else {
            num[num.length - 1] = Integer.valueOf(t);
            num = Arrays.copyOf(num, num.length + 1);
            }
        }
        for(int n : num) answer += n;
        return answer;
    }
}