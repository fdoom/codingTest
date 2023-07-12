class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string += "a";
    	for(int i = 0; i < my_string.length(); i++) {
    		String temp = "";
    		while(my_string.charAt(i) <= '9' && my_string.charAt(i) >= '0')
    			temp += my_string.charAt(i++);
    		if(temp != "")
    			answer += Integer.valueOf(temp);
    	}
        return answer;
    }
}