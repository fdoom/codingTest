class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int len = 0;
        
        for(int n : arr) {
            if(n >= 50 && n % 2 == 0)
                answer[len++] = n / 2;
            else if(n < 50 && n % 2 == 1)
                answer[len++] = n * 2;
            else
                answer[len++] = n;
        }
        return answer;
    }
}