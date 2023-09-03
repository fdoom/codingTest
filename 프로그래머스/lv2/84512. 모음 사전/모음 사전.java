class Solution {
    static int answer = 0;
    static int cnt = 1;
    public int solution(String word) {
        char[] vowel = {'A', 'E', 'I', 'O', 'U'};
        StringBuilder sb = new StringBuilder();
        dfs(word, vowel, sb);
        return answer;
    }
    
    public static void dfs(String word, char[] vowel, StringBuilder sb) {
        if(sb.toString().length() >= 5 || answer > 0)
            return;
        for(int i = 0; i < vowel.length && answer == 0; i++) {
            sb.append(vowel[i]);
            if(answer == 0 && word.equals(sb.toString())) {
                answer = cnt;
                break;  
            }
            cnt++;
            dfs(word, vowel, sb);
            sb.deleteCharAt(sb.toString().length() - 1);
        }
    }
}