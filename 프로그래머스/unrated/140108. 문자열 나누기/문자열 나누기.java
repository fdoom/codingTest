class Solution {
    public int solution(String s) {
        int answer = 0;
        while(!s.isBlank()) {
            char start = s.charAt(0);
            int n1 = 0, n2 = 0;
            for(int i = 0; i < s.length(); i++) {
                if(start == s.charAt(i))
                    n1++;
                else
                    n2++;
                if(n1 == n2) {
                    s = s.substring(i + 1);
                    answer++;
                    break;
                }
            }
            if(n1 != n2) {
                answer++;
                break;
            }
        }
        return answer;
    }
}