class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
    	String[][] s = new String[quiz.length][5];
    	for(int i = 0; i < quiz.length; i++) {
    		s[i] = quiz[i].split(" ");
    	}
    	
    	for(int i = 0; i < s.length; i++) {
    		switch(s[i][1].charAt(0)) {
    		case '+' -> {
    			if(Integer.valueOf(s[i][0]) + Integer.valueOf(s[i][2]) == Integer.valueOf(s[i][4]))
        			answer[i] = "O";
        		else
        			answer[i] = "X";
    		}
    		case '-' -> {
    			if(Integer.valueOf(s[i][0]) - Integer.valueOf(s[i][2]) == Integer.valueOf(s[i][4]))
        			answer[i] = "O";
        		else
        			answer[i] = "X";
    		}
    		}
    		
    	}
        return answer;
    }
}