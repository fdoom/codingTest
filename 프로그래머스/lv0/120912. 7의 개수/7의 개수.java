class Solution {
    public int solution(int[] array) {
        int answer = 0;
    	for(int n : array) {
    		String temp = String.valueOf(n);
    		for(int i = 0; i < temp.length(); i++) {
    			if(temp.charAt(i) == '7')
    				answer++;
    		}
    	}
        return answer;
    }
}