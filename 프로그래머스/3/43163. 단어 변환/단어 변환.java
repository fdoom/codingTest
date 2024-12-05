class Solution {
    int answer = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        dfs(begin, target, words, new boolean[words.length], 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    void dfs(String b, String t, String[] w, boolean[] v, int cnt) {
        if(b.equals(t)) {
            answer = Math.min(answer, cnt);
            return;
        }
        
        for(int i = 0; i < w.length; i++) {
            if(canTransform(b, w[i]) == true && !v[i]) {
                v[i] = true;
                dfs(w[i], t, w, v, cnt + 1);
                v[i] = false;
            }
        }
    }
    
    boolean canTransform(String a, String b) {
        int cnt = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1 ? true : false;
    }
}