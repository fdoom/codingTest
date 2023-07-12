class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int index1 = 0;
        int index2 = 0;
        int max = 0;
        for(int i = 0; i < 3; i++) {
            if(max < sides[i]) {
                max = sides[i];
                
                switch(i) {
                    case 0:
                        index1 = 1;
                        index2 = 2;
                        break;
                    case 1:
                        index1 = 0;
                        index2 = 2;
                        break;
                    case 2:
                        index1 = 0;
                        index2 = 1;
                        break;
                }
            }
        }
        
        if(max < sides[index1] + sides[index2])
            answer = 1;
        return answer;
    }
}