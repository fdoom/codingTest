import java.util.*;
import java.util.stream.*;

class Solution {
    private static boolean[] visited;
    private static List<String> result;
    
    public static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        result = new ArrayList<>();

        // 티켓 배열을 알파벳 순으로 정렬
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));

        // DFS 탐색 시작
        dfs("ICN", "ICN", tickets, 0);

        // 경로 반환
        return result.get(0).split(" ");
    }

    private static void dfs(String current, String path, String[][] tickets, int count) {
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