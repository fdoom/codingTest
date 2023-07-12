class Solution {
    public long solution(String numbers) {
        long answer = 0;
    	final String[] eng = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	String num = "";
    	for(int i = 0; i < numbers.length(); i++) {
    		for(int j = 0; j < eng.length; j++) {
    			int len = (i + eng[j].length() - 1) < numbers.length() ? i + eng[j].length() : numbers.length() - 1;
    			if(eng[j].equals(numbers.substring(i, len))) {
    				num += String.valueOf(j);
    				i += len - i - 1;
    				break;
    			}
    		}
    	}
    	answer = Long.valueOf(num);
        return answer;
    }
}