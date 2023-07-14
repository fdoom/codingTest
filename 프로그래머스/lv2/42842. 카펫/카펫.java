class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
        
        for(int i = 3; i <= size / 2; i++) {
            if(size % i == 0 && (size / i - 2) * (i - 2) == yellow) {
                answer[0] = Math.max(size / i, i);
                answer[1] = Math.min(size / i, i);
            }
        }
        return answer;
    }
}