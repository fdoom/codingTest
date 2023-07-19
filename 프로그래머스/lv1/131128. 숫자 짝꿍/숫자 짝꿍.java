import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(String s : X.split("")) {
            arr1[Integer.parseInt(s)]++;
        }
        for(String s : Y.split("")) {
            arr2[Integer.parseInt(s)]++;
        }
        
        StringBuilder answer = new StringBuilder("");
        for(int i = 9; i >= 0; i--) {
            while(arr1[i]-- > 0 && arr2[i]-- > 0) {
                answer.append(i);
            }
        }
        
        if(answer.toString().isBlank())
            answer.append("-1");
        else if(answer.toString().charAt(0) == '0')
            answer = new StringBuilder("0");
        return answer.toString();
    }
}