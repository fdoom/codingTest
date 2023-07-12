class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int n : numbers)
            answer += (double)n;
        return answer / numbers.length;
    }
}