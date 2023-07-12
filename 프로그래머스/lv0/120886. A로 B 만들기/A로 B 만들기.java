import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] b = before.toCharArray();
    	Arrays.sort(b);
    	char[] a = after.toCharArray();
    	Arrays.sort(a);
        return String.valueOf(b).equals(String.valueOf(a)) ? 1 : 0;
    }
}