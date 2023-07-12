class Solution {
    public String solution(int age) {
        String answer = "";
        
        while(age > 0) {
            answer += (char)(age % 10 + (int)'a');
            age /= 10;
        }
        
        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}