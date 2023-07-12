class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = String.valueOf(my_string.toCharArray());
        for(int i = 0; i < queries.length; i++) {
            String start = "";
            String end = "";
            if(queries[i][0] > 0)
                start = answer.substring(0, queries[i][0]);
            if(queries[i][1] + 1 < answer.length())
                end = answer.substring(queries[i][1] + 1, answer.length());
            StringBuffer sb = new StringBuffer(answer.substring(queries[i][0], queries[i][1] + 1));
            answer = start + sb.reverse().toString() + end;
        }
        return answer;
    }
}