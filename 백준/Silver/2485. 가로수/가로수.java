import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		int GCD = 0;
		for(int i = 1; i < N; i++) {
			int temp = arr[i] - arr[i - 1];
			GCD = gcd(temp, GCD);
		}
		
		System.out.println((arr[N - 1] - arr[0]) / GCD + 1 - N);
	}
	
	private static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}