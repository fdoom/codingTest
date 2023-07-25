class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase().replaceAll("[^a-z|0-9|\\-|_|.]", "").replaceAll("[.]+", ".").replaceAll("^[.]|[.]$", "");
		if(answer.isBlank())
			answer = "a";
		if(answer.length() >= 16) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("^[.]|[.]$", "");
		}
		if(answer.length() <= 2)
			answer += String.valueOf(answer.charAt(answer.length() - 1)).repeat(3 - answer.length());
        return answer;
    }
}