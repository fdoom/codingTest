class Solution {
    public String solution(String s) {
        String answer = "";
        for(String str : s.split(" ")) {
            if(str.matches("^[a-zA-Z](.*)") == true) {
                answer += str.substring(0, 1).toUpperCase();
                if(str.length() > 1)
                    answer += str.substring(1).toLowerCase();
            }
            else 
                answer += str.toLowerCase();
            if(answer.length() < s.length()) answer += " ";
        }
        return answer;
    }
}