import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = {"aya", "ye", "woo", "ma"};
        for(String s : babbling) {
            StringBuilder sb = new StringBuilder();
            int lastIndex = -1;
            for(char c : s.toCharArray()) {
                sb.append(c);
                for(int i = 0; i < 4; i++) {
                    if(i != lastIndex && list[i].equals(sb.toString())) {
                        sb.delete(0, sb.toString().length());
                        lastIndex = i;
                    }
                }
            }
            if(sb.toString().isBlank())
                answer++;
        }
        return answer;
    }
}