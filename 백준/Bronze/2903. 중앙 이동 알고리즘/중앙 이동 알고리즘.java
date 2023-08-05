import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long answer = 4;
		while(T-- > 0)
			answer = answer * 4 - ((int)Math.sqrt(answer) * 2 - 1) * 2 -1;
		System.out.println(answer);
	}
}
