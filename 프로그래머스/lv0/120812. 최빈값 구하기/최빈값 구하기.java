class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001];
        
        int cnt1 = 0;
        for(int n : array) {
            count[n]++;
            if(count[n] > cnt1)
                cnt1 = count[n];
        }
        
        int cnt2 = 0;
        int answer = -1;
        for(int i = 0; i < 1001; i++) {
            if(count[i] == cnt1) {
                answer = i;
                cnt2++;
            }
            
            if(cnt2 > 1)
                return -1;
        }
        return answer;
    }
}