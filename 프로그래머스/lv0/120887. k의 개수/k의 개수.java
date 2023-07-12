class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i <= j; i++) {
        	int len = 0;
            for(String s = Integer.toString(i); len < s.length(); len++) {
                if(s.charAt(len) == k + '0')
                    answer++;
            }
        }
        return answer;
    }
}