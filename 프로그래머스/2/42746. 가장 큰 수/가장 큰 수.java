import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> answer = new ArrayList<>();
        for(int n : numbers) {
            answer.add(String.valueOf(n));
        }
        Collections.sort(answer, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        return answer.get(0).equals("0") ? "0" : String.join("", answer);
    }
}