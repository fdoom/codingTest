class Solution {
    int answer = 0;
    int cnt = 0;
    char[] v = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        dfs(word, new StringBuilder());
        return answer;
    }
    
    void dfs(String w, StringBuilder sb) {
        if(sb.toString().length() >= 5) return;
        
        for(int i = 0; i < v.length && answer == 0; i++) {
            sb.append(v[i]);
            
            cnt++;
            if(w.equals(sb.toString())) {
                answer = cnt;
                break;
            }
            
            dfs(w, sb);
            sb.deleteCharAt(sb.toString().length() - 1);
        }
    }
}