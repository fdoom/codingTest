import java.util.*;

class Solution {
    public ArrayList <String> solution(String[] strArr) {
        ArrayList <String> answer = new ArrayList <String>();
        for(String s : strArr) {
            if(s.contains("ad") == false)
                answer.add(s);
        }
        return answer;
    }
}