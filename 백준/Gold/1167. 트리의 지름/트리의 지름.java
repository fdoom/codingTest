import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Edge>[] lists;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        lists = new ArrayList[V + 1];
        for(int i = 1; i <= V; i++)
            lists[i] = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end;
            while((end = Integer.parseInt(st.nextToken())) != -1)
                lists[start].add(new Edge(end, Integer.parseInt(st.nextToken())));
        }

        visited = new boolean[V + 1];
        distance = new int[V + 1];
        BFS(1);
        int MAX = 1;
        for(int i = 2; i <= V; i++)
            if(distance[MAX] < distance[i])
                MAX = i;

        Arrays.fill(distance, 0);
        Arrays.fill(visited, false);
        BFS(MAX);
        System.out.println(Arrays.stream(distance).max().getAsInt());
    }

    private static void BFS(int index) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(index);
        visited[index] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            for(Edge i : lists[node]) {
                if(!visited[i.e]) {
                    visited[i.e] = true;
                    q.offer(i.e);
                    distance[i.e] = distance[node] + i.value;
                }
            }
        }
    }
}

class Edge {
    int e;
    int value;

    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}