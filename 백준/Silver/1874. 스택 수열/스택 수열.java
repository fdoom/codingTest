import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        int index = 0;

        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 1; i <= N; i++) {
            stack.addFirst(i);
            sb.append('+').append('\n');

            while(!stack.isEmpty() && stack.getFirst() == arr[index]) {
                stack.removeFirst();
                index++;
                sb.append('-').append('\n');
            }
        }
        System.out.println(stack.isEmpty() ? sb : "NO");
        br.close();
    }
}