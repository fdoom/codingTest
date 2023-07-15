import java.util.Scanner;

class Main{
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	
    	String[] S = new String[N];
    	for(int i = 0; i < N; i++)
    		S[i] = sc.next();
    	
    	String[] s = new String[M];
    	int cnt = 0;
    	for(int i = 0; i < M; i++) {
    		s[i] = sc.next();
    		for(int j = 0; j < N; j++) {
    			if(S[j].equals(s[i])) {
    				cnt++;
    				break;
    			}
    		}
    	}
    	System.out.println(cnt);
    	sc.close();
    }
}