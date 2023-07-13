import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        while(n >= 3) {
            list.add(0, n % 3);
            n /= 3;
        }
        list.add(0, n);
        Collections.reverse(list);
        
        int answer = list.remove(list.size() - 1);
        for(int i = 0; list.size() > 0; i++) {
            answer += (int)Math.pow(3, i + 1) * list.remove(list.size() - 1);
        }
        return answer;
    }
}