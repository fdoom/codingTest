import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack <Integer> take = new Stack<>();
		Stack <Integer> wait = new Stack<>();
		while(N-- > 0) {
			int num = sc.nextInt();
			if(num == take.size() + 1)
				take.push(num);
			else
				wait.push(num);
			
			while(!wait.isEmpty() && take.size() + 1 == wait.peek())
				take.push(wait.pop());
		}
		if(wait.isEmpty())
			System.out.println("Nice");
		else
			System.out.println("Sad");
	}
}