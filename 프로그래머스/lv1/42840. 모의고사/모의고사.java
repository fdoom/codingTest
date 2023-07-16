import java.util.*;
class Solution {
    public ArrayList <Integer> solution(int[] answers) {
        ArrayList <Integer> answer = new ArrayList<>();
        int[][] p = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] score = new int[3];
        int best = 0;
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < p.length; j++) {
                if(p[j][i % p[j].length] == answers[i]) {
                    score[j]++;
                    best = Math.max(best, score[j]);
                }
            }
        }
        
        for(int i = 0; i < score.length; i++) {
            if(score[i] == best)
                answer.add(i + 1);
        }
        return answer;
    }
}