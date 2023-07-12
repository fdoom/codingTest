import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
    	int[][] distance = new int[2][2];
    	boolean[] flag = new boolean[4];
        
        for(int i = 0; i < 3; i++) {
    		Arrays.fill(flag, false);
    		distance[0][0] = dots[0][0] - dots[i + 1][0];
    		distance[0][1] = dots[0][1] - dots[i + 1][1];
    		flag[0] = true;
    		flag[i + 1] = true;
    		
    		int x1 = 0, x2 = 0;
    		for(int j = 1; j < 4; j++) {
    			if(!flag[j] && x1 == 0) {
    				x1 = j;
    			}
    			else if(!flag[j] && x2 == 0) {
    				x2 = j;
    				break;
    			}
    		}
    		distance[1][0] = dots[x1][0] - dots[x2][0];
    		distance[1][1] = dots[x1][1] - dots[x2][1];
    		if((double)distance[0][0] / distance[0][1] == (double)distance[1][0] / distance[1][1]) {
    			answer = 1;
    			break;
    		}
    	}
        return answer;
    }
}