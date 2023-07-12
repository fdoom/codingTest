class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int i;
        for(i = 0; num > 0; i++) {
            if(k == num % 10)
                answer = i;
            num /= 10;
        }
        if(answer != -1) answer = i - answer;
        return answer;
    }
}