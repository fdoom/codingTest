import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		int maxValue = 0;
		int index = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
			if(maxValue < arr[i]) {
				index = i;
				maxValue = arr[i];
			}
		}
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			if(index != i)
				sum += arr[i];
		}
		
		while(arr[index] >= sum)
			arr[index]--;
		
		System.out.println(sum + arr[index]);
	}
}