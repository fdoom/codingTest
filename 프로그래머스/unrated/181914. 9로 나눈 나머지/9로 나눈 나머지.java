class Solution {
    public int solution(String number) {
        int answer = 0;
        for(char c : number.toCharArray())
            answer += Integer.valueOf(c + "");
        return answer % 9;
    }
}