class Solution {
    public String solution(String s) {
        String answer = "";
        for(String str : s.split(" ")) {
            String temp = "";
            for(int i = 0; i < str.length(); i++)
                temp += i % 2 == 0 ? str.toUpperCase().charAt(i) : str.toLowerCase().charAt(i);
            answer += temp;
            if(answer.length() < s.length())
                answer += " ";
        }
        for(int i = answer.length(); i < s.length(); i++) answer += " ";
        return answer;
    }
}