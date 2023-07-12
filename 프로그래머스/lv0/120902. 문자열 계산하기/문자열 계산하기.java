class Solution {
    public int solution(String my_string) {
        int answer = 0;
    	String[] str = my_string.split(" ");
    	int num = 0;
    	char operator = ' ';
    	for(String s : str) {
    		if(s.equals("+") || s.equals("-")) {
    			operator = s.charAt(0);
    		}
    		else {
    			if(operator == '-')
    				answer -= Integer.valueOf(s); 
    			else 
    				answer += Integer.valueOf(s);
    		}
    	}
        return answer;
    }
}