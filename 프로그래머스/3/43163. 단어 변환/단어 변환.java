import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int answer = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        Queue<WordInfo> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        q.offer(new WordInfo(begin, 0));

        while (!q.isEmpty()) {
            WordInfo current = q.poll();

            if (current.word.equals(target)) {
                answer = Math.min(answer, current.depth);
                return answer;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canTransform(current.word, words[i])) {
                    visited[i] = true;
                    q.offer(new WordInfo(words[i], current.depth + 1));
                }
            }
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    boolean canTransform(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1;
    }

    class WordInfo {
        String word;
        int depth;

        WordInfo(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}
