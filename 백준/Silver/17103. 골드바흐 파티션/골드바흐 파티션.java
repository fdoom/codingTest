import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] arr = new boolean[1000001];
		Arrays.fill(arr, 2, arr.length, true);
		
		for(int i = 2; i * i <= arr.length; i++) {
			if(arr[i]) {
				for(int j = i * i; j < arr.length; j += i)
					arr[j] = false;
			}
		}
		
		while(N-- > 0) {
			int num = sc.nextInt();
			int cnt = 0;
			for(int i = 2; i <= num / 2; i++) {
				if(arr[i] && arr[num - i])
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}