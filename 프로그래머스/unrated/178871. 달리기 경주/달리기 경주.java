import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap <String, Integer> player = new HashMap<>();
        HashMap <Integer, String> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            player.put(players[i], i);
            rank.put(i, players[i]);
        }
        
        for(String c : callings) {
            int callRank = player.get(c);
            String faster = rank.get(callRank - 1);
            
            player.put(c, callRank - 1);
            player.put(faster, callRank);
            
            rank.put(callRank - 1, c);
            rank.put(callRank, faster);
        }
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = rank.get(i);
        return answer;
    }
}