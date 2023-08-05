class Solution {
    public long solution(int n) {
        long[] arr = new long[n + 1];
        fibo(arr, n);
        return arr[n];
    }
    
    private long fibo(long[] arr, int n) {
        if(n == 1 || n == 0) return arr[n] = 1;
        else if(arr[n] != 0) return arr[n];
        return arr[n] = (fibo(arr, n - 1) + fibo(arr, n - 2)) % 1234567;
    }
}