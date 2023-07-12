class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0) {
            switch(order % 10) {
                case 3, 6, 9 -> answer++;
            }
            order /= 10;
        }
        return answer;
    }
}