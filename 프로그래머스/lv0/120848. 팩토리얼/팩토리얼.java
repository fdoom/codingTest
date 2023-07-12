class Solution {
    static int[] arr = new int[11];
    public int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        else if(arr[n] != 0) return arr[n];
        else return arr[n] = n * factorial(n - 1);
    }
    
    public int solution(int n) {
        int answer = 0;
        factorial(10);
        for(int i = 0; i < 11; i++) {
            if(arr[i] == n) {
                answer = i;
                break;
            }
            if(arr[i] > n) {
                answer = i -1;
                break;
            }
        }
        return answer;
    }
}