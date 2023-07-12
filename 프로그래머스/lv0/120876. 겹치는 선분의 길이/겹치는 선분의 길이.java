class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        for(int i= -100 ; i < 100 ; i++){
            int cnt = 0;
            for(int j = 0; j < 3; j++) {
                if(lines[j][0] <= i && lines[j][1] > i)
                    cnt++;
            }

            if(cnt>1) answer++;
        }
        return answer;
    }
}