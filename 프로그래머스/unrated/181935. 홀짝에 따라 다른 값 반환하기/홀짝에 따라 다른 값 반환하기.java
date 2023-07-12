class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n % 2 == 1 ? 1 : 2; i <= n; i += 2) {
            if(i % 2 == 1)
                answer += i;
            else
                answer += i * i;
        }
        return answer;
    }
}