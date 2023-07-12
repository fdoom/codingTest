class Solution {
    public int[][] solution(int n) {
        int[][] move = {
            {0, 1},
            {-1, 0},
            {0, -1},
            {1, 0}
        };
        int[][] answer = new int[n][n];
        int value = 2;
        answer[0][0] = 1;
        int x = 0, y = 0;
        while(value != n * n + 1) {
            for(int i = 0; i < move.length; i++) {
                while(x + move[i][0] < answer.length && y + move[i][1] < answer.length && x + move[i][0] >= 0 && y + move[i][1] >= 0) {
                    if(answer[x + move[i][0]][y + move[i][1]] != 0) break;
                    x = x + move[i][0];
                    y = y + move[i][1];
                    answer[x][y] = value++;
                }

            }
        }
        return answer;
    }
}