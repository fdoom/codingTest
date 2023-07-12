class Solution {
    boolean solution(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(')
                count++;
            else if(count > 0 && c == ')')
                count--;
            else
                return false;
        }
        return count == 0 ? true : false;
    }
}