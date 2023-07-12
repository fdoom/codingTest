import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
    	for(int i = 0; i < score.length; i++)
    		avg[i] = Math.round((score[i][0] + score[i][1]) / 2.0 * 100)/100.0;

    	double[] temp = avg.clone();
    	Arrays.sort(temp);
    	
    	int[] answer = new int[avg.length];
    	int cnt = 1;
    	int rank = 1;
    	for(int i = temp.length - 1; i >= 0; i--) {
    		for(int j = 0; j < avg.length; j++) {
    			if(avg[j] == temp[i]) {
    				answer[j] = rank;
    				avg[j] = -1;
    				cnt++;
    			}
    		}
    		rank = cnt;
    	}
        return answer;
    }
}