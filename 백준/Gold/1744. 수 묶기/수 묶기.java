import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> plustQ = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minusQ = new PriorityQueue<>();
        int zeroCnt = 0;
        int oneCnt = 0;
        while(N-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) zeroCnt++;
            else if(input == 1) oneCnt++;
            else if(input > 0)
                plustQ.offer(input);
            else
                minusQ.offer(input);
        }

        int answer = oneCnt;
        while(plustQ.size() >= 2)
            answer += plustQ.poll() * plustQ.poll();
        if(!plustQ.isEmpty()) answer += plustQ.poll();

        while(minusQ.size() >= 2)
            answer += minusQ.poll() * minusQ.poll();
        if(!minusQ.isEmpty() && zeroCnt == 0)
            answer += minusQ.poll();

        System.out.println(answer);
    }
}