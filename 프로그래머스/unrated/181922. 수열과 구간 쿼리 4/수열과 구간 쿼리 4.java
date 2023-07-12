class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            for(int start = queries[i][0]; start <= queries[i][1]; start++) {
                if(start % queries[i][2] == 0) arr[start]++;
            }
        }
        return arr;
    }
}