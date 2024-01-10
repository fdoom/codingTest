import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[size + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; st.hasMoreTokens(); i++)
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int start, end;
        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken()) - 1;
            end = Integer.parseInt(st.nextToken());
            sb.append(arr[end] - arr[start]).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}