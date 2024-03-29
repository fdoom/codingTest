import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum < x)
                left++;
            else if(sum > x)
                right--;
            else {
                answer++;
                left++;
                right--;
            }
        }
        System.out.println(answer);
        br.close();
    }
}