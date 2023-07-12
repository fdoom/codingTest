class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < my_string.length(); i++) {
            boolean flag = true;
            for(char c : vowel) {
                if(my_string.charAt(i) == c) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer += my_string.charAt(i);
        }
        return answer;
    }
}