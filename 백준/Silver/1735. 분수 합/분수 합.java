import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ab = new int[2][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++)
				ab[i][j] = sc.nextInt();
		}
		
		ab[0][0] *= ab[1][1];
		ab[1][0] *= ab[0][1];
		ab[0][1] *= ab[1][1];
		int[] answer = { ab[0][0] + ab[1][0], ab[0][1] };
		int GCD = gcd(Math.max(answer[0], answer[1]), Math.min(answer[0], answer[1]));
		for(int n : answer)
			System.out.print(n / GCD + " ");
	}
	
	private static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}