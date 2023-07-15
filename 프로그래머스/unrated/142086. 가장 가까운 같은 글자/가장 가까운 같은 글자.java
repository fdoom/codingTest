class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String n = "";
        for(int i = 0; i < s.length(); i++) {
            if(n.lastIndexOf(s.charAt(i)) == -1) {
                n += s.charAt(i);
                answer[i] = -1;
            }
            else {
                answer[i] = i - n.lastIndexOf(s.charAt(i));
                n += s.charAt(i);
            }
        }
        return answer;
    }
}