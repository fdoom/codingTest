import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(answer.indexOf(numbers[i] + numbers[j]) == -1)
                    answer.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}