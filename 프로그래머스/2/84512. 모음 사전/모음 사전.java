class Solution {
    int answer = 0;
    int cnt = 1;
    
    public int solution(String word) {
        char[] vowel = {'A', 'E', 'I', 'O', 'U'};
        dfs(word, vowel, new StringBuilder());
        return answer;
    }
    
    void dfs(String word, char[] vowel, StringBuilder sb) {
        if(sb.toString().length() >= 5)
            return;
        
        for(int i = 0; i < vowel.length && answer == 0; i++) {
            sb.append(vowel[i]);
            if(word.equals(sb.toString())) {
                answer = cnt;
                break;  
            }
            
            cnt++;
            dfs(word, vowel, sb);
            sb.deleteCharAt(sb.toString().length() - 1);
        }
    }
}