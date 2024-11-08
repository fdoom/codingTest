import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> primes = new HashSet<>();
    
    public int solution(String numbers) {
        generateNumbers(numbers, "");
        return primes.size();
    }

    private void generateNumbers(String numbers, String current) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            
            if(isPrime(num))
               primes.add(num);
        }

        for (int i = 0; i < numbers.length(); i++) {
            generateNumbers(
                numbers.substring(0, i) + numbers.substring(i + 1),
                current + numbers.charAt(i)
            );
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}