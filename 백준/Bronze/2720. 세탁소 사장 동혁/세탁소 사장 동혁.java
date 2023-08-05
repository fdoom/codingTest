import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] coin = { 25, 10, 05, 01 };
		while(T-- > 0) {
			int C = sc.nextInt();
			
			int[] cnt = new int[coin.length];
			for(int i = 0; i < coin.length; i++) {
				cnt[i] = C / coin[i];
				C %= coin[i];
			}
			for(int i = 0; i < cnt.length; i++)
				System.out.print(cnt[i] + " ");
			System.out.println();
		}
	}
}