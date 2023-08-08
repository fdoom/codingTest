import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		int minus = 3;
		while(N > 0) {
			answer++;
			N -= minus;
			minus += 2;
		}
		System.out.println(answer);
	}
}