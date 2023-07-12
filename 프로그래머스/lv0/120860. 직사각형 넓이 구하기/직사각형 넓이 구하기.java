class Solution {
    public int solution(int[][] dots) {
        int cnt = 0;
    	int num1 = 0;
    	int num2 = 0;
    	for(int i = 1; i < 4; i++) {
    		if(dots[0][1] == dots[i][1]) {
    			num1 = Math.abs(dots[0][0] - dots[i][0]);
    			cnt++;
    		}
    		else if(dots[0][0] == dots[i][0]){
    			num2 = Math.abs(dots[0][1] - dots[i][1]);
    			cnt++;
    		}
    		if(cnt == 2) break;
    	}
        return num1 * num2;
    }
}