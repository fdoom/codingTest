class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        while(q < code.length()) {
            answer += code.substring(0, q).charAt(r);
            code = code.substring(q);
        }
        if(code.length() > r) answer += code.charAt(r);
        return answer;
    }
}