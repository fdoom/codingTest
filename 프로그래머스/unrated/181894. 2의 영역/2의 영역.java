import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int front = -1, back = -1;
        for(int i = 0; i < arr.length; i++) {
            if(front == -1 && arr[i] == 2)
                front = i;
            if(back == -1 && arr[arr.length - i - 1] == 2)
                back = arr.length - i - 1;
        }
        int[] answer = {-1};
        if(front != -1)
            answer = Arrays.copyOfRange(arr, front, back + 1);
        return answer;
    }
}