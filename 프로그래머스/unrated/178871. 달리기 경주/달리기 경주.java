import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map <String, Integer> player = new HashMap<>();
        for(int i = 0; i < players.length; i++)
            player.put(players[i], i);
        
        for(String c : callings) {
            int callRank = player.get(c);
            
            String temp = players[callRank];
            players[callRank] = players[callRank - 1];
            players[callRank - 1] = temp;
            
            player.put(c, callRank - 1);
            player.put(players[callRank], callRank);
        }
        return players;
    }
}