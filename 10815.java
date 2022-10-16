import java.util.Scanner;

class Main{
	static int[] number = new int[20000002];
	
	public static int arrayIndex(int n) {
		return (n > 0) ? (n + 10000000) : (n * -1);
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	for(int i = 0; i < N; i++)
    		number[arrayIndex(sc.nextInt())] = 1;
    	
    	int M = sc.nextInt();
    	for(int i = 0; i < M; i++)
    		System.out.print(number[arrayIndex(sc.nextInt())] + " ");
    	sc.close();
    }
}