class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        switch(direction) {
            case "right" -> {
                int temp = numbers[numbers.length - 1];
                for(int i = numbers.length - 1; i > 0; i--)
                    numbers[i] = numbers[i - 1];
                numbers[0] = temp;
            }
            default -> {
                int temp = numbers[0];
                for(int i = 0; i < numbers.length - 1; i++)
                    numbers[i] = numbers[i + 1];
                numbers[numbers.length - 1] = temp;
            }
        }
        return numbers;
    }
}