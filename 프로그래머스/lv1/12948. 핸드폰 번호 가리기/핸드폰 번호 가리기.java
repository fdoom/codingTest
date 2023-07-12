import java.util.*;

class Solution {
    public String solution(String phone_number) {
        char[] star = new char[phone_number.length() - 4];
        Arrays.fill(star, '*');
        String answer = String.valueOf(star) + phone_number.substring(star.length);
        return answer;
    }
}