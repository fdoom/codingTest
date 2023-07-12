class Solution {
    public int solution(String my_string, String is_suffix) {
        StringBuffer sb1 = new StringBuffer(my_string);
        StringBuffer sb2 = new StringBuffer(is_suffix);
        int answer = sb1.reverse().toString().indexOf(sb2.reverse().toString()) == 0 ? 1 : 0;
        return answer;
    }
}