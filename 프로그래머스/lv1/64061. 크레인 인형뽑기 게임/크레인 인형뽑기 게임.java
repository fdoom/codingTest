import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List <List<Integer>> BOARD = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            List <Integer> temp = new ArrayList<>();
            for(int j = 0; j < board.length; j++) {
                if(board[j][i] != 0)
                    temp.add(board[j][i]);
            }
            BOARD.add(temp);
        }
        
        Stack<Integer> basket = new Stack<>();
        for(int m : moves) {
            if(!BOARD.get(m - 1).isEmpty()) {
                if(basket.isEmpty())
                    basket.push(BOARD.get(m - 1).remove(0));
                else {
                    if(basket.peek() == BOARD.get(m - 1).get(0)) {
                        basket.pop();
                        BOARD.get(m - 1).remove(0);
                        answer += 2;
                    }
                    else
                        basket.push(BOARD.get(m - 1).remove(0));
                }
            }
        }
        return answer;
    }
}