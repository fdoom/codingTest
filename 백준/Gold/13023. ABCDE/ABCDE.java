import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] lists;
    static int total = 0;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        lists = new ArrayList[N];
        for(int i = 0; i < N; i++)
            lists[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            lists[a].add(b);
            lists[b].add(a);
        }

        for(int i = 0; i < N; i++) {
            DFS(i, 1);
            if(total == 5) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }

    static void DFS(int n, int currentDepth) {
        if(total == 5 || currentDepth == 5) {
            total = 5;
            return;
        }

        visited[n] = true;

        for(int i : lists[n]) {
            if(!visited[i])
                DFS(i, currentDepth + 1);
        }

        visited[n] = false;
    }
}