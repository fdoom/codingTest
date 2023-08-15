import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set <String> set = new HashSet<>();
		int N = sc.nextInt();
		while(N-- > 0) {
			String A = sc.next();
			String B = sc.next();
			
			if((A.equals("ChongChong") || B.equals("ChongChong")) || (set.contains(A) || set.contains(B))) {
				set.add(A);
				set.add(B);
			}
		}
		System.out.println(set.size());
	}
}