class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp1 = Integer.valueOf(String.valueOf(a).concat(String.valueOf(b)));
        answer = temp1 > 2 * a * b ? temp1 : 2 * a * b; 
        return answer;
    }
}