class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c = 'a'; c <= 'l'; c++)
            myString = myString.replace(c, 'l');
        return myString;
    }
}