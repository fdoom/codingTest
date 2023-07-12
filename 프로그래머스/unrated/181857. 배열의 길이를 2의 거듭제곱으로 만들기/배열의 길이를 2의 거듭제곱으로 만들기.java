class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        if(arr.length != 1) {
            len = 2;
            while(len < arr.length)
                len *= 2;
        }
        int[] answer = new int[len];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}