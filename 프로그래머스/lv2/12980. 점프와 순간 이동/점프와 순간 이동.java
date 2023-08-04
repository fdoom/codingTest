public class Solution {
    public static int solution(int n) {
        String s = Integer.toBinaryString(n);
        int ans = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '1')
                ans++;
        return ans;
    }
}