import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Deque <int[]> d = new ArrayDeque<>();
		for(int i = 0; i < N; i++) {
			int[] arr = { i + 1, sc.nextInt() };
			d.add(arr);
		}
		
		while(d.size() != 1) {
			int[] arr = d.remove();
			sb.append(arr[0]).append(' ');
			int move = arr[1];
			
			if(move > 0) {
				for(int i = 1; i < move; i++)
					d.add(d.remove());
			}
			else
				for(int i = move; i < 0; i++)
					d.addFirst(d.removeLast());
		}
		System.out.println(sb.toString() + d.remove()[0]);
	}
}