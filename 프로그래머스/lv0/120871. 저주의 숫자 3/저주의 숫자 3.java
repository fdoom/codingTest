class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for(int i = 1; i < Integer.MAX_VALUE; i++) {
            if(!String.valueOf(i).matches("(.*)3(.*)") && i % 3 != 0) {
                count++;
            }
            if(count == n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}