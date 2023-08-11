import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue <String> city = new LinkedList<>();
        for(String s : cities) {
            s = s.toLowerCase();
            if(city.contains(s)) {
                answer++;
                city.remove(s);
                city.offer(s);
            }
            else {
                answer += 5;
                if(city.size() == cacheSize)
                    city.poll();
                if(city.size() < cacheSize)
                    city.offer(s);
            }
        }
        return answer;
    }
}