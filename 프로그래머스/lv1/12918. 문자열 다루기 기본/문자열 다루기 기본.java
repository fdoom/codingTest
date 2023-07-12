class Solution {
    public boolean solution(String s) {
        boolean answer = s.matches("\\d{4}|\\d{6}");
        return answer;
    }
}