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
        answer[0] = 7 - zero - same >= 6 ? 6 : 7 - zero - same;
        answer[1] = 7 - same >= 6 ? 6 : 7 - same;
        return answer;
    }
}