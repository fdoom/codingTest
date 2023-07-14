class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i + p.length() <= t.length(); i++) {
            String s = t.substring(i, i + p.length());
            if(s.compareTo(p) <= 0)
                answer++;
        }
        return answer;
    }
}