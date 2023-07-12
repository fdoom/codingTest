import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
    	Arrays.sort(c);
    	for(int i = 0; i < c.length; i++) {
    		if(String.valueOf(c).indexOf(String.valueOf(c).charAt(i)) == i) {
    			int cnt = 0;
    			for(int j = i + 1; j < c.length; j++) {
    				if(c[i] == c[j])
    					cnt++;
    			}
    			if(cnt == 0)
    				answer += c[i];
    		}
    	}
        return answer;
    }
}