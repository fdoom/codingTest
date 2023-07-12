class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = sol(arr1.length, arr2.length);
        
        if(answer == 0) {
            int sum1 = 0, sum2 = 0;
            for(int s1 : arr1)
                sum1 += s1;
            for(int s2 : arr2)
                sum2 += s2;
            
            answer = sol(sum1, sum2);
        }
        return answer;
    }
    
    private int sol(int n1, int n2) {
        if(n1 > n2)
            return 1;
        else if(n1 < n2)
            return -1;
        return 0;
    }
}