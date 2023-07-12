import java.util.*;

class Solution {
    public ArrayList <String> solution(String my_string) {
        ArrayList <String> answer = new ArrayList <String>();
        for(String s : my_string.strip().split(" ")) {
            if(s.isBlank() == false) {
                answer.add(s);
            }
        }
        return answer;
    }
}