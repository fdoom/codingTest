import java.util.*;
import java.util.stream.*;

class Solution {
    int answer = 0;
    int cnt = 0;
    char[] v = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        dfs(word, new Stack<Character>());
        return answer;
    }
    
    void dfs(String w, Stack s) {
        if(s.size() >= 5) return;
        
        for(int i = 0; i < v.length && answer == 0; i++) {
            s.push(v[i]);
            
            cnt++;
            if(w.equals(s.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining()))) {
                answer = cnt;
                break;
            }
            
            dfs(w, s);
            s.pop();
        }
    }
}