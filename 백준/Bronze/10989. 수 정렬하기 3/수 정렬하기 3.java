import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(br.readLine())];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Arrays.stream(arr).sorted().forEach(a -> sb.append(a).append('\n'));
        System.out.println(sb);
        br.close();
    }
}