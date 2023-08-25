import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }
        
        for(String s : sb.reverse().toString().split("0")) {
            long num = 0;
            if(s.isEmpty()) continue;
            
            num = Long.parseLong(s);
            if(num > 1) {
                answer++;
                boolean check = false;
                Set <Long> set = new HashSet<>();
                for(long i = 2; i * i <= num; i++) {
                    if(set.contains(i)) continue;
                    if(num % i == 0) {
                        check = true;
                        break;
                    }
                    for(long j = i; j <= num; j *= i) {
                        set.add(j);
                        if(num % j == 0) {
                            check = true;
                            break;
                        }
                    }
                }
                if(check) answer--;
            }
        }
        return answer;
    }
}