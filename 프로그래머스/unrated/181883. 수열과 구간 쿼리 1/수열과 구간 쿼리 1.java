class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            for(int temp = queries[i][0]; temp <= queries[i][1]; temp++)
                arr[temp]++;
        }
        return arr;
    }
}