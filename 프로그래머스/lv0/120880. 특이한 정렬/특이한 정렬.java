import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
		int[][] temp = new int[numlist.length][2];
		for(int i = 0; i < numlist.length; i++) {
			temp[i][0] = Math.abs(n - numlist[i]);
			temp[i][1] = numlist[i];
		}
        
		Arrays.sort(temp, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int []b) {
				if(a[0] == b[0]) return b[1] - a[1];
				return a[0] - b[0];
			}
		});
        
		int[] answer = new int[numlist.length];
		for(int i = 0; i < temp.length; i++)
			answer[i] = temp[i][1];
        return answer;
    }
}