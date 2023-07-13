class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean flag = String.valueOf(c).matches("[a-z]");
            if(c == ' ') answer += ' ';
            else if((flag && String.valueOf((char)(c + n)).matches("[a-z]")) || (!flag && String.valueOf((char)(c + n)).matches("[A-Z]")))
                answer += (char) (c + n);
            else if(flag)
                answer += (char)('a' + n - ('z' - c) - 1);
            else
                answer += (char)('A' + n - ('Z' - c) - 1);
        }
        return answer;
    }
}