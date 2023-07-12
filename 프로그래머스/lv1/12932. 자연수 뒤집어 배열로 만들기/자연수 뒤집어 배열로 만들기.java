import java.util.*;

class Solution {
    public ArrayList <Integer> solution(long n) {
        ArrayList <Integer> answer = new ArrayList<>();
        for(String s : String.valueOf(n).split("")) {
            answer.add(0, Integer.parseInt(s));
        }
        return answer;
    }
}