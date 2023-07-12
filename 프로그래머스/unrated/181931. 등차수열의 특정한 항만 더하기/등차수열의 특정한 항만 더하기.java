class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int temp = a;
        for(boolean b : included) {
            if(b) answer += temp;
            temp += d;
        }
        return answer;
    }
}