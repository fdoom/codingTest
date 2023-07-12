class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int temp = num1;
        denum1 *= num2;
        num1 *= num2;

        denum2 *= temp;
        num2 *= temp;

        int[] answer = {(denum1 + denum2), num1};
        int size = (answer[0] < answer[1]) ? answer[0] : answer[1];

        for(int i = 2; i <= size; i++) {
            if(answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] /= i;
                answer[1] /= i;
                size = (answer[0] < answer[1]) ? answer[0] : answer[1];
                i = 1;
            }
        }
        return answer;
    }
}