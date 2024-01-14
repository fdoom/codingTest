import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> {
            if(Math.abs(a) != Math.abs(b))
                return Math.abs(a) - Math.abs(b);
            return a - b;
        });

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if (queue.isEmpty())
                    sb.append('0').append('\n');
                else
                    sb.append(queue.poll()).append('\n');
            }
            else
                queue.add(input);
        }
        System.out.println(sb);
        br.close();
    }
}