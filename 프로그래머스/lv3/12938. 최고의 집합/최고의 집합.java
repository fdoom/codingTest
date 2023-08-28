class Solution {
    public int[] solution(int n, int s) {
        if(n > s) return new int[] {-1};
        int[] answer = new int[n];
        int index = 0;
        while(n > 0){
            int value = s/n;
            answer[index++] = value;
            s -= value;
            n--;
        }
        return answer;
    }
}