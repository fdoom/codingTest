import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map <String, Integer> map = new HashMap<>();
            for(String w : want)
                map.put(w, 0);
        for(int i = 0; i <= discount.length - 10; i++) {
            Map <String, Integer> temp = new HashMap<>();
            temp.putAll(map);
            
            for(int j = i; j < i + 10; j++)
                if(temp.containsKey(discount[j]))
                    temp.put(discount[j], temp.get(discount[j]) + 1);
            
            boolean flag = true;
            for(int j = 0; j < want.length; j++)
                if(temp.get(want[j]) != number[j])
                    flag = false;
            if(flag) answer++;
            
            
        }
        return answer;
    }
}