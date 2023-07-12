class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int remainder = 0;
        while(chicken >= 10) {
            answer += chicken / 10;
            remainder = chicken % 10;
            chicken = chicken / 10 + remainder;
        }
        return answer;
    }
}