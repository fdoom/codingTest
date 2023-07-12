class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        boolean flag = true;
        int cnt = -1;
        while(flag) {
            for(int i = 0; i < numbers.length; i++) {
                cnt++;
                if(cnt / 2 == k - 1) {
                    flag = false;
                    answer = numbers[i];
                    break;
                }
            }
        }
        return answer;
    }
}