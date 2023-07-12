class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String d : dic) {
            int dicCnt = 0;
            int spellCnt = 0;
            for(String s : spell) {
                int check = 0;
                for(int i = 0; i < d.length(); i++) {
                    if(d.charAt(i) == s.charAt(0)) {
                        dicCnt++;
                        check = 1;
                    }
                }
                spellCnt += check;
            }
            if(spellCnt == spell.length && dicCnt == d.length()) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}