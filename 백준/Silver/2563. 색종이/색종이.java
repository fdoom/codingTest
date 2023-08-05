import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] board = new boolean[100][100];
		while(N-- > 0) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			for(int i = w; i - w < 10; i++) {
				for(int j = h; j - h < 10; j++)
					board[i][j] = true;
			}
		}
		
		int sum = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j])
					sum++;
			}
		}
		System.out.println(sum);
	}
}