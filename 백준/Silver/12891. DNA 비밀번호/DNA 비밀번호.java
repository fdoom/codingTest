import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String temp = st.nextToken();
		
		st = new StringTokenizer(br.readLine());
		int[][] cnt = new int[4][2];
		for(int i = 0; i < cnt.length; i++) {
			cnt[i][0] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		String[] point = {"A", "C", "G", "T"};
		String temp2 = null;
		for(int i = 0; i < temp.length() - P + 1; i++) {
			if(i == 0) { //처음 부분 문자열 추출 및 갯수 확인
				temp2 = temp.substring(i, i + P);
				for(int j = 0; j < 4; j++) {
					cnt[j][1] = temp2.length() - temp2.replace(point[j], "").length();
				}
			}
			else {		//문자열 이동시 추가된 문자 추가
				for(int j = 0; j < 4; j++) {
					if(String.valueOf(temp.charAt(i + P - 1)).equals(point[j])) {
						cnt[j][1]++;
						break;
					}
				}
			}
			
			//비밀번호 조건 확인 및 정답 수 증가
			int c = 0;
			for(int k = 0; k < 4; k++) {
				if(cnt[k][1] >= cnt[k][0])
					c++;
			}
			if(c == 4) result++;
			
			for(int j = 0; j < 4; j++) {	//부분 문자열의 첫 번째 부분 제거
				if(String.valueOf(temp.charAt(i)).equals(point[j])) {
					cnt[j][1]--;
					break;
				}
			}
		}
		System.out.println(result);
	}
}