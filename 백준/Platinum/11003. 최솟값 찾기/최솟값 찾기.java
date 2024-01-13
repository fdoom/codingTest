import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<int[]> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int[] index = {i ,Integer.parseInt(st.nextToken())};
            while(!deque.isEmpty() && deque.peekLast()[1] > index[1])
                deque.removeLast();

            deque.addLast(index);
            if(deque.peekFirst()[0] == i - L)
                deque.removeFirst();

            sb.append(deque.peekFirst()[1]).append(' ');
        }
        System.out.println(sb);
        br.close();
    }
}