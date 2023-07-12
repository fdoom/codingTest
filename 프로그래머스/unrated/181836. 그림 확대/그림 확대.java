import java.util.*;

class Solution {
    public ArrayList <String> solution(String[] picture, int k) {
        ArrayList <String> answer = new ArrayList <String> ();
        for(String s : picture) {
            String temp = "";
            for(char c : s.toCharArray()) {
                for(int i = 0; i < k; i++)
                    temp += c;
            }
            for(int i = 0; i < k; i++)
                answer.add(temp);
        }
        return answer;
    }
}