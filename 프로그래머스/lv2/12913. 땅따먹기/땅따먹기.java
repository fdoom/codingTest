import java.util.*;
class Solution {
    static int[][] memo;
    int solution(int[][] land) {
        memo = new int[land.length][land[0].length];
        for(int i = 0; i < memo.length; i++)
            Arrays.fill(memo[i], -1);
        int answer = 0;
        for (int i = 0; i < land[0].length; i++)
            answer = Math.max(answer, dfs(land, 0, i));
        return answer;
    }
    
	public static int dfs(int[][] land, int row, int col) {
		if(row == land.length - 1) return land[row][col];
        
        if (memo[row][col] != -1) return memo[row][col];
        
        int score = 0;
        for (int i = 0; i < land[row].length; i++)
            if (i != col)
                score = Math.max(score, land[row][col] + dfs(land, row + 1, i));
        
        return memo[row][col] = score;
	}    
}