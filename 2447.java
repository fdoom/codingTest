import java.util.Scanner;

class Main{
	static char[][] star;
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	star = new char[N][N];
    	inputStar(0, 0, N, true);
    	
    	for(int i = 0; i < star.length; i++) {				//문자를 문자열로 변환(시간초과 방지)
    		System.out.println(String.valueOf(star[i]));
    	}
    	sc.close();
    }
    
    public static void inputStar(int x, int y, int n, boolean check) {
    	if(!check) {										//빈칸이라면
    		for(int i = x; i < x + n; i++)
    			for(int j = y; j < y + n; j++)
    				star[i][j] = ' ';
    		return;
    	}
    	
    	if(n == 1) {										//완전히 분할되었다면
    		star[x][y] = '*';
    		return;
    	}
    	
    	int cnt = 0;
    	for(int i = x; i < x + n; i += (n / 3)) {			//행 3분의 1
    		for(int j = y; j < y + n; j += (n / 3)) {		//열 3분의 1
    			if(++cnt == 5)								//가운데 비우기
    				inputStar(i, j, n / 3, false);
    			else
    				inputStar(i, j, n / 3, true);
    		}
    	}
    }
}