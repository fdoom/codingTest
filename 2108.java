import java.util.*;

class Main{
	
	static int index;		//배열 인덱스 값
	
	//배열 인덱스 찾기
	public static void arrayIndex(int n) {
		if(n > 0) index = n + 4000;			//입력된 값이 양수라면
		else if(n < 0) index = n * -1;		//음수라면
		else index = 0;						//0이라면
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//수의 총 갯수
		int sum = 0;						//입력된 수들의 합
		int big = 0;						//최대 빈도 수
		int[] arr = new int[n];				//수
		int[] count = new int[8002];		//카운팅 정렬
		
		for(int i = 0; i < n; i++) {		//수 입력
			arr[i] = sc.nextInt();
			arrayIndex(arr[i]);			
			count[index]++;
			big = big > count[index] ? big : count[index];		//최대 빈도수 확인
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		int cnt = 0;		//두 번째로 작은 값 확인용 변수
		int num = 4001;		//최빈값
		for(int i = 0; i < n; i++) {
			arrayIndex(arr[i]);
			if(count[index] == big && num != arr[i]) {			//최대 빈도수이면서 중복되지 않은 값이라면
				num = arr[i];
				cnt++;
			}
			else continue;
			if(cnt == 2) break;
		}
		
		System.out.println(Math.round((double)sum / n));
		System.out.println(arr[n / 2]);
		System.out.println(num);
		System.out.println(arr[n - 1] - arr[0]);
		sc.close();
	}
}