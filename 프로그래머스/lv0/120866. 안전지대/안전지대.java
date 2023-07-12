class Solution {
    public int solution(int[][] board) {
        int[][] area = {
            {-1, -1},
            {-1, 0},
            {-1, 1},
            {0, -1},
            {0, 1},
            {1, -1},
            {1, 0},
            {1, 1}
        };
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    for(int k = 0; k < area.length; k++) {
                        int x = i + area[k][0];
                        int y = j + area[k][1];
                        if(x >= 0 && x < board.length && y >= 0 && y < board.length && board[x][y] != 1)
                            board[x][y] = 2;
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0)
                    answer++;
            }
            System.out.println();
        }
        return answer;
    }
}