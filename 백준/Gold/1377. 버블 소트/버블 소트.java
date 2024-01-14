import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[Integer.parseInt(br.readLine())][2];
        for(int i = 0; i < arr.length; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int max = 0;
        for(int i = 0; i < arr.length; i++)
            max = Math.max(max, arr[i][1] - i);
        System.out.println(max + 1);
        br.close();
    }
}