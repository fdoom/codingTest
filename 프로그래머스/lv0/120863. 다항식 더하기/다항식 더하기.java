class Solution {
    public String solution(String polynomial) {
        int x = 0;
		int n = 0;
        String[] temp = polynomial.split(" \\+ ");
		for(String s : temp) {
			if(s.contains("x")) {
				if(s.substring(0, s.length() - 1).isBlank())
					x++;
				else
					x += Integer.parseInt(s.substring(0, s.length() - 1));
			}
			else
				n += Integer.parseInt(s);
		}
		String answer = "";
		if(n == 0 && x > 1) answer = x + "x";
		else if(n == 0) answer = "x";
		else if(x == 0 && n > 0) answer = n + "";
        else if(x == 1) answer = "x + " + n;
		else answer = x + "x + " + n;
        return answer;
    }
}