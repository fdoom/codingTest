import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int sum = 0;
		for(int i = N.length() - 1; i >= 0; i--) {
			char c = N.charAt(i);
			int temp = 0;
			if(c >= 'A' && c <= 'Z')
				temp = c - 'A' + 10;
			else
				temp = c - '0';
			sum += (int) Math.pow((double)B, N.length() - i - 1) * temp;
		}
		System.out.println(sum);
	}
}