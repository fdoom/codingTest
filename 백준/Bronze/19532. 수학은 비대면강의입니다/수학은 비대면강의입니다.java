import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = -999; i <= 999; i++) {
			for(int j = -999; j <= 999; j++) {
				if(arr[0][0] * i + arr[0][1] * j == arr[0][2] && arr[1][0] * i + arr[1][1] * j == arr[1][2]) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}
}