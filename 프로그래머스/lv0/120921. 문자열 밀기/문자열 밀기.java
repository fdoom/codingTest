class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        if(A.equals(B)) return 0;
        
    	for(int i = 0; i < A.length(); i++) {
    		char c = A.charAt(A.length() - 1);
    		String s = String.valueOf(c);
    		s += A.substring(0, A.length() - 1);
    		A = s;
    		if(A.equals(B)) {
    			answer += i + 2;
    			break;
    		}
    	}
        return answer;
    }
}