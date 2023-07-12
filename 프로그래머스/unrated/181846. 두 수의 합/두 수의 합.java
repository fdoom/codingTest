import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = new BigDecimal(a).add(new BigDecimal(b)).toString();
        return answer;
    }
}