class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        StringBuffer sb = new StringBuffer(my_string.substring(s, e + 1));
        answer = answer.concat(sb.reverse().toString());
        if(e < my_string.length())
            answer = answer.concat(my_string.substring(e + 1));
        return answer;
    }
}