import java.util.*;

class Solution {
    public ArrayList <Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList <Integer> answer = new ArrayList <Integer>();
        for(String str : intStrs) {
            str = str.substring(s, s + l);
            if(Integer.parseInt(str) > k)
                answer.add(Integer.parseInt(str));
        }
        
        return answer;
    }
}