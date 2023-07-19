class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int same = 0;
        for(int n : lottos) {
            if(n == 0) {
                zero++;
                continue;
            }
            for(int win : win_nums) {
                if(n == win) {
                    same++;
                    break;
                }
            }
        }
        answer[0] = Math.min(7 - zero - same, 6);
        answer[1] = Math.min(7 - same, 6);
        return answer;
    }
}