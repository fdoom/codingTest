import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Deque <Integer> d = new ArrayDeque<>();
		while(N-- > 0) {
			int cmd = sc.nextInt();
			switch(cmd) {
			case 1: d.addFirst(sc.nextInt()); break;
			case 2: d.addLast(sc.nextInt()); break;
			case 3: 
				if(d.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(d.removeFirst()).append('\n');
				break;
			case 4:
				if(d.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(d.removeLast()).append('\n');
				break;
			case 5: sb.append(d.size()).append('\n'); break;
			case 6: 
				if(d.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;
			case 7:
				if(d.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(d.peekFirst()).append('\n');
				break;
			case 8:
				if(d.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(d.peekLast()).append('\n');
			}
		}
		System.out.println(sb.toString());
	}
}