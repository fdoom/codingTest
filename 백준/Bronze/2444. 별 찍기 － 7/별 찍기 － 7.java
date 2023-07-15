import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = 1;
		String blank = " ";
		String star = "*";
		for(int i = 0; i < n; i++) {
			System.out.println(blank.repeat(n - i - 1) + star.repeat(len));
			len += 2;
		}
		len -= 4;
		for(int i = 0; i < n - 1; i++) {
			System.out.println(blank.repeat(i + 1) + star.repeat(len));
			len -= 2;
		}
	}
}