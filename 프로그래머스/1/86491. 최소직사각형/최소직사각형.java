import java.lang.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] wallet = new int[2];
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            wallet[0] = Math.max(wallet[0], sizes[i][0]);
            wallet[1] = Math.max(wallet[1], sizes[i][1]);
        }
        return wallet[0] * wallet[1];
    }
}