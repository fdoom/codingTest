class Solution {
    public int solution(int n) {
        int answer = 0;
        int s1 = count(Integer.toBinaryString(n));
        for(int i = n + 1; i <= 1000000; i++) {
            int s2 = count(Integer.toBinaryString(i));
            if(s1 == s2) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    private int count(String s) {
        int cnt = 0;
        for(int j = 0; j < s.length(); j++)
                if(s.charAt(j) == '1') cnt++;
        return cnt;
    }
}