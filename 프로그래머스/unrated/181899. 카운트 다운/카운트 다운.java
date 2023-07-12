class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int len = 0;
        for(int i = start; i >= end; --i)
            answer[len++] = i;
        return answer;
    }
}