import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		while(N-- > 0) {
			BigInteger num = new BigInteger(sc.next());
			if(num.isProbablePrime(10))
				System.out.println(num);
			else
				System.out.println(num.nextProbablePrime());
		}
	}
}