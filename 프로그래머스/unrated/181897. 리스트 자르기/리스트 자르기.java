import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null;
        switch(n) {
            case 1 -> answer = Arrays.copyOf(num_list, slicer[1] + 1);
            case 2 -> answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 -> answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 -> {
                int index = 0;
                answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    answer[index++] = num_list[i];
                } 
            }
        }
        return answer;
    }
}