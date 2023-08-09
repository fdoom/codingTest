import java.util.*;
class Solution {
    public List<Long> solution(int n, long left, long right) {
		List <Long> list = new ArrayList<>();
        long cnt = left / n * n;
        for(long i = left / n; i < n; i++) {
            if(cnt > right + 1) break;
            for(long j = 0; j < n; j++) {
                if(cnt > right) break;
                if(cnt >= left && cnt <= right)
                    list.add(Math.max(i, j) + 1);
                cnt++;
            }
        }
        return list;
    }
}