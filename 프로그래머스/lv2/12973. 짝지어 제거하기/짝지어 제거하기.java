import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack <String> c = new Stack<>();
        for(String str : s.split("")) {
            if(c.isEmpty())
                c.push(str);
            else if(c.peek().equals(str))
                c.pop();
            else
                c.push(str);
        }
        int answer = c.isEmpty() ? 1 : 0;
        return answer;
    }
}