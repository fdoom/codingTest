class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String s = ineq.concat(eq);
        if(s.contains(">="))
            answer = n >= m ? 1 : 0;
        else if(s.contains("<="))
            answer = n <= m ? 1 : 0;
        else if(s.contains(">!"))
            answer = n > m ? 1 : 0;
        else
            answer = n < m ? 1 : 0;
        return answer;
    }
}