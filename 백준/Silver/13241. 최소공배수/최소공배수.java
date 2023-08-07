import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = gcd(Math.max(a, b), Math.min(a, b));
		System.out.println(a * b / c);
	}
	
	private static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}