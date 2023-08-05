import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt() + 1];
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int num = sc.nextInt();
			
			for(int j = start; j <= end; j++)
				arr[j] = num;
		}
		for(int i = 1; i < arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}