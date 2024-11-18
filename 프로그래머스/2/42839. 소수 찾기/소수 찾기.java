import java.util.*;

public class Solution {
    Set<Integer> primes = new HashSet<>();

    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        generateNumbers(numbers, visited, new StringBuilder());
        return primes.size();
    }

    private void generateNumbers(String numbers, boolean[] visited, StringBuilder current) {
        // 숫자가 비어 있지 않을 때만 처리
        if (current.length() > 0) {
            int num = Integer.parseInt(current.toString());

            // 소수이면 Set에 추가
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        // 모든 숫자를 한번씩 사용하여 가능한 조합 생성
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                // 현재 숫자를 추가
                visited[i] = true;
                current.append(numbers.charAt(i));

                // 재귀 호출
                generateNumbers(numbers, visited, current);

                // 백트래킹
                visited[i] = false;
                current.deleteCharAt(current.length() - 1);
            }
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
