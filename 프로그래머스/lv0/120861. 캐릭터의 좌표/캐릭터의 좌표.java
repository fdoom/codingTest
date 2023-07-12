class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = (board[0] - 1) / 2;
    	int height = (board[1] - 1) / 2;
    	
    	for(String k : keyinput) {
    		switch(k.charAt(0)) {
    		case 'u' -> {
    			if(height >= Math.abs(answer[1] + 1))
    				answer[1]++;
    		}
    		case 'd' -> {
    			if(height >= Math.abs(answer[1] - 1))
    				answer[1]--;
    		}
    		case 'r' -> {
    			if(width >= Math.abs(answer[0] + 1))
    				answer[0]++;
    		}
    		case 'l' -> {
    			if(width >= Math.abs(answer[0] - 1))
    				answer[0]--;
    		}
    		}
    	}
        return answer;
    }
}