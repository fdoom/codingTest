class Solution {
    public int solution(int a, int b) {
        int temp1 = Integer.valueOf(String.valueOf(a).concat(String.valueOf(b)));
        int temp2 = Integer.valueOf(String.valueOf(b).concat(String.valueOf(a)));
        int answer = temp1 > temp2 ? temp1 : temp2;
        return answer;
    }
}