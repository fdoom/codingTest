import java.util.*;

class Solution {
    public ArrayList <String> solution(String myStr) {
        ArrayList <String> answer = new ArrayList <String> ();
        String temp = "";
        for(int i = 0; i < myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                myStr = myStr.substring(i + 1);
                i = -1;
                if(!temp.isBlank()) {
                    answer.add(temp);
                    temp = "";
                }
            }
            else temp += myStr.charAt(i);
        }
        if(temp.isBlank()) answer.add("EMPTY");
        else answer.add(temp);
        return answer;
    }
}