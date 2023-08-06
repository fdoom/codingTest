import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] wh = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}; 
		while(N-- > 0) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if(wh[0] > w) wh[0] = w;
			if(wh[2] < w) wh[2] = w;
			
			if(wh[1] > h) wh[1] = h;
			if(wh[3] < h) wh[3] = h;
		}
		System.out.println((wh[2] - wh[0]) * (wh[3] - wh[1]));
	}
}