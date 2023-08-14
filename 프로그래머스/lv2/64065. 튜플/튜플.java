import java.util.*;
class Solution {
    public Set<Integer> solution(String s) {
        Set <Integer> set = new LinkedHashSet<>();
        String[] str = s.split("[{|}]");
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        for(String s1 : str) {
            for(String s2 : s1.split("(,)"))
                if(s2.matches("[0-9]+"))
                    set.add(Integer.parseInt(s2));
        }
        return set;
    }
}