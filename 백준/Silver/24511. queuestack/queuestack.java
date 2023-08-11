import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		Deque <Integer> d = new ArrayDeque<>();
		while(N-- > 0) {
			int n = Integer.parseInt(st2.nextToken());
			if(Integer.parseInt(st.nextToken()) == 0) {
				d.add(n);
			}
		}
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			 int n = Integer.parseInt(st.nextToken());
			 d.addFirst(n);
			 sb.append(d.removeLast()).append(' ');
		}
		System.out.println(sb.toString());
	}
}