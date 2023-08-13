import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map <String, Integer> cnt = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if(!cnt.containsKey(clothes[i][1]))
                cnt.put(clothes[i][1], 1);
            else
                cnt.put(clothes[i][1], cnt.get(clothes[i][1]) + 1);
        }
        for(String key : cnt.keySet())
            answer *= cnt.get(key) + 1;
        return answer - 1;
    }
}