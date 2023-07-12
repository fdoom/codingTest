import java.math.BigInteger;
class Solution {
    static BigInteger[] arr = new BigInteger[31];
    public BigInteger solution(int balls, int share) {
        arr[0] = arr[1] = new BigInteger("1");
        factorial(balls);
        BigInteger answer = arr[balls].divide(arr[balls - share]).divide(arr[share]);
        return answer;
    }
    
    BigInteger factorial(int n) {
    	if(arr[n] != null) return arr[n];
        return arr[n] = factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
}