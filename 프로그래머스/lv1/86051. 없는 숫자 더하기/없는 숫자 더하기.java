class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int n : numbers) answer += n;
        return 9 * (9 / 2 + 1) - answer;
    }
}