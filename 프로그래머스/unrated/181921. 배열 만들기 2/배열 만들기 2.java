import java.util.*;
class Solution {
    public ArrayList <Integer> solution(int l, int r) {
        ArrayList <Integer> answer = new ArrayList <Integer>();
        for(int i = l; i <= r; i++) {
            if(!String.valueOf(i).matches("(.*)([1-4]|[6-9])(.*)"))
                answer.add(i);
        }
        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}