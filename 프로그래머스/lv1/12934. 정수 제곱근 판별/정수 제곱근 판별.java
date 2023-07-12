class Solution {
    public long solution(long n) {
        long answer = 0;
        if(String.valueOf(Math.sqrt(n)).matches("(.*)\\.(.*)[1-9]"))
            answer = -1;
        else
            answer = (long)Math.pow(Math.sqrt((double)n) + 1, 2);
        return answer;
    }
}