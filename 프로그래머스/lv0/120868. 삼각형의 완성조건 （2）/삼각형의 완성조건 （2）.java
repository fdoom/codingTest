class Solution {
    public int solution(int[] sides) {
        int answer = 0;
    	int big = sides[0] > sides[1] ? sides[0] : sides[1];
    	int small = sides[0] < sides[1] ? sides[0] : sides[1];
    	for(int i = 0; i < sides[0] + sides[1]; i++) {
    		if(i > big)
    			answer++;
    		if(big < small + i && i <= big)
    			answer++;
    	}
        return answer;
    }
}