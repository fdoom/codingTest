import java.util.*;

class Solution {
    public ArrayList <Integer> solution(int[] arr, int[] delete_list) {
        ArrayList <Integer> answer = new ArrayList <Integer>();
        for(int num : arr) {
            boolean flag = true;
            for(int del : delete_list) {
                if(del == num) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer.add(num);
        }
        return answer;
    }
}