class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()) {
            int cnt = 0;
            for(int i = 0; i < index + cnt; i++) {
                if(++c > 'z')
                    c = 'a';
                if(skip.contains(String.valueOf(c)))
                    cnt++;
            }
            answer.append(c);
        }
        return answer.toString();
    }
}