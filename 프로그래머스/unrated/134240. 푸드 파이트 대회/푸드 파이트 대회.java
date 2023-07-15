class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++) {
            String num = String.valueOf(i);
            answer += num.repeat(food[i] / 2);
        }
        StringBuffer sb = new StringBuffer(answer);
        answer += "0" + sb.reverse().toString();
        return answer;
    }
}