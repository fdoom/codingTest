	import java.util.Arrays;
	class Solution {
	    public long solution(int n, int[] times) {
        long answer = 0;
        long min = 0;
        long max = Arrays.stream(times).max().getAsInt() * (long)n;
        long mid;

        while(min <= max) {
            long total = 0;

            mid = (min + max) / 2;
            for(int time : times) {
                total += mid / time;
            }

            if(total < n) min = mid + 1;
            else {
                max = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}
