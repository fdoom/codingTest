class Solution {
    int[] arr = null;
    public int solution(int n) {
        arr = new int[n + 1];
        fibo(n);
        return arr[n];
    }
    private int fibo(int n) {
        if(n == 0) return arr[n];
        else if(n == 1) return arr[n] = 1;
        else if(arr[n] != 0) return arr[n];
        return arr[n] = (fibo(n - 1) + fibo(n - 2)) % 1234567;
    }
}