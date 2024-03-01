import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>();
        while(N-- > 0)
            q.offer(Integer.parseInt(br.readLine()));

        int answer = 0;
        while(q.size() != 1) {
            int sum = q.poll() + q.poll();
            answer += sum;
            q.offer(sum);
        }
        System.out.println(answer);
    }
}