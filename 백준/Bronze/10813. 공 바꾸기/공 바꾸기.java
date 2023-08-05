import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt() + 1];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i;
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		for(int i = 1; i < arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}