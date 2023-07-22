class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()) {
            int cnt = 0;
            char temp = c;
            for(int i = 0; i < index + cnt; i++) {
                temp++;
                if(temp > 'z')
                    temp = 'a';
                if(skip.matches("(.*)" + temp + "(.*)"))
                    cnt++;
            }
            answer.append(temp);
        }
        return answer.toString();
    }
}