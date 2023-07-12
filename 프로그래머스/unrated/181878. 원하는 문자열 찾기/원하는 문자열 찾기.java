class Solution {
    public int solution(String myString, String pat) {
        int answer = (myString.toUpperCase().contains(pat.toUpperCase()) == true) ? 1 : 0;
        return answer;
    }
}