import java.util.*;
class Solution
{
    static int answer = 0;
    private static void subdivision(int a, int b, int left, int right, int cnt) {
        if(left == right) return;
        int mid = (left + right) / 2;
        
        boolean[] check = new boolean[2];
        if(left + 1 <= a && mid + 1 >= a)
            check[0] = true;
        if(mid + 2 <= b && right + 1 >= b)
            check[1] = true;
        
        if(check[0] && check[1]) {
            answer = cnt;
            return;
        }
        else if(check[0])
            subdivision(a, b, left, mid, cnt - 1);
        else
            subdivision(a, b, mid + 1, right, cnt - 1);
    }
    
    public int solution(int n, int a, int b) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if((int)Math.pow(2, i) == n) {
                cnt = i;
                break;
            }
        }
        
        subdivision(Math.min(a, b), Math.max(a,b), 0, n - 1, cnt);
        System.out.println(answer);
        return answer;
    }
}