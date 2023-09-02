import java.util.*;
class Solution {
    static int answer = Integer.MAX_VALUE;
    static boolean[] check;
    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    
    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!check[i] && canTransform(begin, words[i])) {
                check[i] = true;
                dfs(words[i], target, words, cnt + 1);
                check[i] = false;
            }
        }
    }
    
    public static boolean canTransform(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
        }
        return diffCount == 1;
    }
}