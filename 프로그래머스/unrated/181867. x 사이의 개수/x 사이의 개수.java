import java.util.*;

class Solution {
    public ArrayList <Integer> solution(String myString) {
        ArrayList <Integer> answer = new ArrayList <Integer>();
        for(String s : myString.split("x"))
            answer.add(s.length());
        if(myString.charAt(myString.length() - 1) == 'x')
            answer.add(0);
        return answer;
    }
}