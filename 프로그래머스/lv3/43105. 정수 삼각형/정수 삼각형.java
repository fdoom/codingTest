class Solution {
    static int len;
    static int[][] arr;
    public static int solution(int[][] triangle) {
        len = triangle.length;
        arr = new int[triangle.length][triangle[triangle.length - 1].length];
        return DP(triangle, 0, 0);
    }
    public static int DP(int[][] triangle, int col, int row) {
        if(col == len - 1) return triangle[col][row];
        else if(arr[col][row] > 0) return arr[col][row];
        else return arr[col][row] = triangle[col][row] + Math.max(DP(triangle, col + 1, row), DP(triangle, col + 1, row + 1));
    }
}