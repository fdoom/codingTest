import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int bread = 0;
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(int i : ingredient) {
            sb.append(i); len++;
            if(i == 1) bread++;
            if(i == 1 && bread >= 2 && len >= 4) {
                if(sb.substring(len - 4).equals("1231")) {
                    sb.delete(len - 4, len);
                    len -= 4;
                    answer++;
                }
            }
        }
        return answer;
    }
}