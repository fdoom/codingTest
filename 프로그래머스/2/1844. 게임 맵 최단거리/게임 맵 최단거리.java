import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x, y, cnt;

    Node(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

class Solution {
    // 위, 아래, 오른쪽, 왼쪽
    int[][] move = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };
    
    int answer = -1;

    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;
        bfs(maps, 0, 0, visited);
        return answer;
    }

    void bfs(int[][] maps, int x, int y, boolean[][] v) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y, 1));

        while (!q.isEmpty()) {
            Node cur = q.remove();

            if (cur.x == maps.length - 1 && cur.y == maps[0].length - 1) {
                answer = cur.cnt;
                break;
            }

            for (int[] m : move) {
                int moveX = cur.x + m[0];
                int moveY = cur.y + m[1];
                
                if (moveX >= 0 && moveX < maps.length &&
                        moveY >= 0 && moveY < maps[0].length &&
                        maps[moveX][moveY] == 1 && !v[moveX][moveY]) {
                    v[moveX][moveY] = true;
                    q.add(new Node(moveX, moveY, cur.cnt + 1));
                }
            }
        }
    }
}
