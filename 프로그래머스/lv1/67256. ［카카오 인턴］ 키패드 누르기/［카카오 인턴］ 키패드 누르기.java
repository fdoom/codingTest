class Point{
    int x;
    int y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getDistance(int x, int y) {
         return Math.abs(this.x - x) + Math.abs(this.y - y);
    }
}

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] phone = {
            {1, 4, 7},
            {2, 5, 8, 0},
            {3, 6, 9}
        };
        
        Point l = new Point(0, 3);
        Point r = new Point(2, 3);
        for(int num : numbers) {
        	boolean check = false;
            for(int i = 0; i < phone.length; i++) {
                for(int j = 0; j < phone[i].length; j++) {
                    if(phone[i][j] == num) {
                        switchPoint(answer, l, r, i, j, hand);
                        check = true;
                        break;
                    }
                }
                if(check) break;
            }
        }
        return answer.toString();
    }
    
    public void switchPoint(StringBuilder sb, Point l, Point r, int x, int y, String hand) {
        switch(x) {
            case 0 -> move(sb, l, x, y, true);
            case 2 -> move(sb, r, x, y, false);
            default -> {
                if(l.getDistance(x, y) > r.getDistance(x, y)) move(sb, r, x, y, false);
                else if(l.getDistance(x, y) == r.getDistance(x, y)) {
                    if(hand.equals("right")) move(sb, r, x, y, false);
                    else move(sb, l, x, y, true);
                }
                else move(sb, l, x, y, true);
            }
        }
    }
    
    public void move(StringBuilder sb, Point p, int x, int y, boolean leftHand) {
        p.setPoint(x, y);
        if(leftHand) sb.append("L");
        else sb.append("R");
    }
}