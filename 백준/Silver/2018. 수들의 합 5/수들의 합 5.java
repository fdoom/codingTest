import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 1;
        for(int i = 1; i < N; i++) {
            int sum = i;
            for(int j = i + 1; j < N; j++) {
                sum += j;
                if(sum > N) break;
                else if(sum == N) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}