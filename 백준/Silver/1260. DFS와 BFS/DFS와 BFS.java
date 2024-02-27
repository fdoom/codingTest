import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static List<Integer>[] lists;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        lists = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++)
            lists[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            lists[a].add(b);
            lists[b].add(a);
        }

        for(int i = 1; i <= N; i++)
            Collections.sort(lists[i]);

        DFS(V);
        sb.append('\n');
        Arrays.fill(visited, false);
        BFS(V);
        System.out.println(sb);
    }

    static void DFS(int node) {
        visited[node] = true;
        sb.append(node).append(' ');
        for(int i : lists[node]) {
            if(!visited[i])
                DFS(i);
        }
    }

    static void BFS(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            for(int i : lists[q.peek()]) {
                if(!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
            sb.append(q.poll()).append(' ');
        }
    }
}