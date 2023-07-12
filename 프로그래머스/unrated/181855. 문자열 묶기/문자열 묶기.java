class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int [] arr = new int[31];
        for(String s : strArr)
            arr[s.length()]++;
        
        for(int i = 0; i < arr.length; i++) {
            if(answer < arr[i]) {
                answer = arr[i];
            }
        }
        return answer;
    }
}