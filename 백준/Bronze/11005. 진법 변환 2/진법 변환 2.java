import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		Stack <String> s = new Stack<>();
		while(N > 0) {
			int temp = N % B;
			if(temp >= 10 && temp <= 35)
				s.push(String.valueOf((char)('A' + temp - 10)));
			else
				s.push(String.valueOf(temp));
			N /= B;
		}
		while(!s.isEmpty())
			System.out.print(s.pop());
	}
}
