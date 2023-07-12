class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int n : num_list) {
            sum += n;
            mul *= n;
        }
        
        if(num_list.length < 11 || sum <= 10)
            answer = mul;
        else answer = sum;
        return answer;
    }
}