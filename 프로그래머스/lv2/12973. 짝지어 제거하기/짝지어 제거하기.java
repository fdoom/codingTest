import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack <String> c = new Stack<>();
        for(String str : s.split("")) {
            if(c.isEmpty())
                c.add(str);
            else if(c.lastElement().equals(str))
                c.remove(c.size() - 1);
            else
                c.add(str);
        }
        int answer = c.isEmpty() ? 1 : 0;
        return answer;
    }
}