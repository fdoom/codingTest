import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String p : participant) {
            if(map.containsKey(p))
                map.put(p, map.get(p) + 1);
            else
                map.put(p, 1);
        }
        
        for(String c : completion) {
            if(map.get(c) - 1 == 0)
                map.remove(c);
            else
                map.put(c, map.get(c) - 1);
        }
        
        return map.keySet().iterator().next();
    }
}