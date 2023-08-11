import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List <Integer> list = new ArrayList<>();
		Deque <Integer> d = new ArrayDeque<>();
		for(int i = 0; i < N; i++)
			list.add(Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(list.get(i) == 0)
				d.add(n);
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