import java.util.*;
import java.time.*;
import java.time.temporal.ChronoField;
class Solution {
    public List<Integer> solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        Map <Integer, Integer> price = new TreeMap<>();
        Map <Integer, LocalTime> time = new HashMap<>();
        Map <Integer, Integer> count = new HashMap<>();
        
        for(String r : records) {
            LocalTime t = LocalTime.parse(r.substring(0, 5));
            int num = Integer.parseInt(r.substring(6, 10));
            String check = r.substring(11);
            
            if(!price.containsKey(num)) {
                price.put(num, 0);
                count.put(num, 0);
            }
            
            if(check.equals("OUT")) {
                int countTime = (int)(t.getLong(ChronoField.MINUTE_OF_DAY) - time.get(num).getLong(ChronoField.MINUTE_OF_DAY));
                count.put(num, count.get(num) + countTime);
                time.remove(num);
            }
            else time.put(num, t);
        }
        for(int key : time.keySet()) {
            LocalTime last = LocalTime.parse("23:59");
            int countTime = (int)(last.getLong(ChronoField.MINUTE_OF_DAY) - time.get(key).getLong(ChronoField.MINUTE_OF_DAY));
            count.put(key, count.get(key) + countTime);
        }
        
        for(int key : price.keySet()) {
            price.put(key, price.get(key) + fees[1]);
            int countTime = count.get(key);
            if(countTime > fees[0]) {
                countTime -= fees[0];
                int addPrice = countTime / fees[2] * fees[3];
                if(countTime % fees[2] != 0) addPrice += fees[3];
                price.put(key, price.get(key) + addPrice);
            }
            answer.add(price.get(key));
        }
        return answer;
    }
}