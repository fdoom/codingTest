class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            String temp = "";
            for(String one : s.split("0"))
                temp += one;
            answer[1] += s.length() - temp.length();
            answer[0]++;
            s = String.valueOf(Integer.toBinaryString(temp.length()));
        }
        return answer;
    }
}