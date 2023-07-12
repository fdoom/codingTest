import java.util.*;

class Solution {
    public ArrayList <Integer> solution(int n) {
        ArrayList <Integer> answer = new ArrayList <Integer>();
        answer.add(n);
        while(n != 1) {
            n = (n % 2 == 1) ? 3 * n + 1 : n / 2;
            answer.add(n);
        }
        return answer;
    }
}