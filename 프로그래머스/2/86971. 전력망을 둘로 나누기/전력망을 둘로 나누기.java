import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        // 그래프 생성(양방향)
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            g.get(wire[0]).add(wire[1]);
            g.get(wire[1]).add(wire[0]);
        }

        // 각 전선을 끊고 계산
        for (int[] wire : wires) {
            // 전선을 끊는다(양방향)
            g.get(wire[0]).remove(Integer.valueOf(wire[1]));
            g.get(wire[1]).remove(Integer.valueOf(wire[0]));

            // 송전탑 개수 계산
            int count1 = bfs(g, n, wire[0]);        // wire[0] 기준 그래프 연결 노드 탐색
            int count2 = n - count1;                    // 반대편 그래프 노드 수

            // 최소 차이 갱신
            answer = Math.min(answer, Math.abs(count1 - count2));

            // 전선 복구
            g.get(wire[0]).add(wire[1]);
            g.get(wire[1]).add(wire[0]);
        }

        return answer;
    }

    private int bfs(List<List<Integer>> graph, int n, int start) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        int cnt = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            cnt++;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;       // 방문 처리
                    q.add(neighbor);
                }
            }
        }

        return cnt;
    }
}