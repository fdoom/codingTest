class Solution {
    public int solution(String s) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String temp = "";
        while(!s.isBlank()) {
            if(s.matches("^[0-9](.*)")) {
                temp += s.charAt(0);
                s = s.substring(1);
            }
            else {
                for(int i = 0; i < number.length; i++) {
                    if(s.indexOf(number[i]) == 0) {
                        temp += i + "";
                        s = s.substring(number[i].length());
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(temp);
    }
}