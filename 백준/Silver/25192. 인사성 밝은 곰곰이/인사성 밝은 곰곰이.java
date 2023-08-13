import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set <String> set = new HashSet<>();
		int answer = 0;
		while(N-- > 0) {
			String name = sc.next();
			if(name.equals("ENTER")) {
				answer += set.size();
				set.clear();
			}
			else
				set.add(name);
		}
		answer += set.size();
		System.out.println(answer);
	}
}