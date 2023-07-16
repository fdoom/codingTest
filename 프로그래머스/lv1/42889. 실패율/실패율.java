import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] fail = new double[N][2];
        int temp = stages.length;
        
        for(int i = 0; i < N; i++) {
            fail[i][1] = (double)(i + 1);
            int cnt = 0;
            for(int j = 0; j < stages.length; j++) {
                if((i + 1) == stages[j]) {
                    cnt++;
                }
            }
            
            if(temp > 0)
               fail[i][0] = (double)cnt / temp;
            else
                fail[i][0] = 0;
            temp -= cnt;
        }
        
        Arrays.sort(fail, new Comparator<double[]>(){
            @Override
            public int compare(double[] f1, double[] f2) {
                if(f1[0] > f2[0])
                    return -1;
                else if(f1[0] == f2[0])
                    return 0;
                else
                    return 1;
            }
        });
        
        for(int i = 0; i < N; i++)
            answer[i] = (int) fail[i][1];
        return answer;
    }
}