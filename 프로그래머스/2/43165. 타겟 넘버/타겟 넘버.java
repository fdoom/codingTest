class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    void dfs(int[] n, int t, int sum, int index) {
        if(index == n.length) {
            if(t == sum) answer++;
            return;
        }
        
        dfs(n, t, sum + n[index], index + 1);
        dfs(n, t, sum - n[index], index + 1);
    }
}