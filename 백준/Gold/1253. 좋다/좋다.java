import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long[] arr = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
		int result = 0;
		for(int k = 0; k < N; k++) {
			int i = 0;
			int j = N - 1;
			while(i < j) {
				if(arr[i] + arr[j] == arr[k]) {
					if(i != k && j != k) {
						result++;
						break;
					}
					else if(i == k) i++;
					else if(j == k) j--;
				}
				else if(arr[i] + arr[j] < arr[k]) i++;
				else j--;
			}
		}
		System.out.println(result);
		br.close();
	}
}