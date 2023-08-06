import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		String answer = "Scalene";
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			
			int cnt = 0;
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i])
					cnt++;
			}
			if(cnt == 1)
				answer = "Isosceles";
			if(cnt == 2)
				answer = "Equilateral";
		}
		if(sum == 180)
			System.out.println(answer);
		else
			System.out.println("Error");
	}
}