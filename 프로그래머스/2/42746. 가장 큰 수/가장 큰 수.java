import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> str = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++)
            str.add(String.valueOf(numbers[i]));
        Collections.sort(str, (a, b) -> (b + a).compareTo(a + b));
        
        if(str.get(0).equals("0")) return "0";
        return String.join("", str);
    }
}