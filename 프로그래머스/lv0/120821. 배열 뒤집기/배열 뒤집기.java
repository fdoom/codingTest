class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int i = num_list.length;
        for(int n : num_list) {
            answer[--i] = n;
        }
        return answer;
    }
}