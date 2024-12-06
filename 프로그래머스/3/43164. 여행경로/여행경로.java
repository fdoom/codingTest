import java.util.*;
import java.util.stream.*;

class Solution {
    boolean[] visited;
    List<String> result = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];

        // DFS 탐색 시작
        dfs("ICN", "ICN", tickets, 0);
        
        // 모든 항공권을 소진한 경우 알파벳 순서로 정렬
        Collections.sort(result);
        
        // 경로 반환
        return result.get(0).split(" ");
    }

    void dfs(String current, String path, String[][] tickets, int count) {
        // 모든 항공권을 소진한 경우
        if (count == tickets.length) {
            result.add(path);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, count + 1);
                visited[i] = false;
            }
        }
    }
}