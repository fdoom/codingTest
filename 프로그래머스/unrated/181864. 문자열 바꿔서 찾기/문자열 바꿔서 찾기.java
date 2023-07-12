class Solution {
    public int solution(String myString, String pat) {
        String temp = "";
        for(char c : myString.toCharArray()) {
            if(c == 'A')
                temp = temp.concat("B");
            else
                temp = temp.concat("A");
        }
        int answer = temp.contains(pat) ? 1 : 0;
        return answer;
    }
}