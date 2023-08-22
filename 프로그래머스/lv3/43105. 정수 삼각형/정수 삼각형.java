class Solution {
    static int[][] arr;
    public static int solution(int[][] triangle) {
        arr = new int[triangle.length][triangle[triangle.length - 1].length];
        return DP(triangle, 0, 0);
    }
    public static int DP(int[][] triangle, int row, int col) {
        if(row == triangle.length - 1) return triangle[row][col];
        else if(arr[row][col] > 0) return arr[row][col];
        else return arr[row][col] = triangle[row][col] + Math.max(DP(triangle, row + 1, col), DP(triangle, row + 1, col + 1));
    }
}