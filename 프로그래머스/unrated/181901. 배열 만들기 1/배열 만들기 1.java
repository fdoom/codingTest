class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int len = 0;
        for(int i = k; i <= n; i += k ) {
            answer[len++] = i;
        }
        return answer;
    }
}