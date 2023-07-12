class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        while(myString.length() > 0) {
            if(myString.contains(pat)) {
                answer++;
                myString = myString.substring(myString.indexOf(pat) + 1);
            }
            else myString = myString.substring(1);
            
        }
        return answer;
    }
}