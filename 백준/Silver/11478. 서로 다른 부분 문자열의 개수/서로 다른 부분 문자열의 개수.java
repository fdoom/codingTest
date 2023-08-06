import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		Set <String> set = new HashSet<>();
		for(int i = 0; i < S.length(); i++) {
			for(int j = i + 1; j < S.length() + 1; j++) {
				set.add(S.substring(i, j));
			}
		}
		System.out.println(set.size());
	}
}