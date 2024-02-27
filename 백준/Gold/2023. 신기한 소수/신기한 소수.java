import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 2; i < 9; i++)
            if(isPrime(i))
                DFS(i, 1);
        System.out.println(sb);
    }

    static void DFS(int num, int currentDepth) {
        if(currentDepth == N) {
            sb.append(num).append('\n');
            return;
        }
        int temp = num * 10;
        for(int i = 1; i <= 9; i += 2) {
            temp += i;
            if(isPrime(temp))
                DFS(temp, currentDepth + 1);
            temp -= i;
        }
    }
    static boolean isPrime(int num) {
        for(int i = 2; i < num; i++)
            if(num % i == 0)
                return false;
        return true;
    }
}