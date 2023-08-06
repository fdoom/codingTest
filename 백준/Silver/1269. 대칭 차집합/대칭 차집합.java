import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		Set <String> setA = new HashSet<>();
		while(A-- > 0)
			setA.add(sc.next());
		
		Set <String> setB = new HashSet<>();
		while(B-- > 0)
			setB.add(sc.next());
		
		Set <String> tempA = new HashSet<>();
		tempA.addAll(setA);
		
		tempA.removeAll(setB);
		setB.removeAll(setA);
		System.out.println(tempA.size() + setB.size());
	}
}