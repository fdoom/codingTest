import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] board;
    static boolean[][] visited;
    static int[][] move = {
            {0, 1},
            {-1, 0},
            {1, 0},
            {0, -1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            int j = 0;
            for(char c : br.readLine().toCharArray()) {
                board[i][j++] = c - '0';
            }
        }

        BFS(0, 0);
        System.out.println(board[N- 1][M - 1]);
    }

    static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int[] node = q.poll();

            for(int i = 0; i < move.length; i++) {
                int tempX = node[0] + move[i][0];
                int tempY = node[1] + move[i][1];

                if(tempX >= 0 && tempX < board.length && tempY >= 0 && tempY < board[0].length && board[tempX][tempY] == 1 && !visited[tempX][tempY]) {
                    q.offer(new int[]{tempX, tempY});
                    visited[tempX][tempY] = true;
                    board[tempX][tempY] = board[node[0]][node[1]] + 1;
                }
            }
        }
    }
}