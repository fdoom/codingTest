class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < computers.length; i++) {
            if(visited[i]) continue;
            dfs(n, computers, visited, i);
            answer++;
        }
        return answer;
    }
    
    void dfs(int n, int[][] c, boolean[] v, int index) {
        v[index] = true;
        
        for(int i = 0; i < n; i++) {
            if(!v[i] && c[index][i] == 1) {
                dfs(n, c, v, i);
            }
        }
    }
}