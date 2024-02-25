import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static List<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr= new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for(int i = 1; i < N + 1; i++)
            arr[i] = new ArrayList<Integer>();
        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            arr[n1].add(n2);
            arr[n2].add(n1);
        }

        int count = 0;
        for(int i = 1; i < N + 1; i++) {
            if(!visited[i]) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void DFS(int n) {
        if(visited[n]) return;
        visited[n] = true;
        for(int i : arr[n]) {
            if(!visited[i])
                DFS(i);
        }
    }
}