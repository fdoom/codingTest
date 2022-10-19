import java.util.*;

class Main{
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	
    	HashMap<String, String> Pokemon = new HashMap<>();
    	for(int i = 1; i < N + 1; i++)	{
    		String s = sc.next();
    		Pokemon.put(String.valueOf(i), s);
    		Pokemon.put(s, String.valueOf(i));
    	}
    	
    	for(int i = 0; i < M; i++)
    		System.out.println(Pokemon.get(String.valueOf(sc.next())));
    	sc.close();
    }
}