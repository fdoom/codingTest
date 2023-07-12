class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        if(row - col < 0)
            row += Math.abs(row - col);
        else if(row - col > 0)
            col += row - col;
        int[][] answer = new int[row][col];
        for(int i = 0; i < arr.length; i++)
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        return answer;
    }
}