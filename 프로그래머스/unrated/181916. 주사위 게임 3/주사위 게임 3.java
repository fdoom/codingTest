import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = new int[7];
        arr[a]++; arr[b]++; arr[c]++; arr[d]++;
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > 0) {
                ArrayList <Integer> temp = new ArrayList <Integer>();
                temp.add(arr[i]);
                temp.add(i);
                list.add(temp);
            }
        }
        
        switch (list.size()) {
                case 1 -> answer = 1111 * list.get(0).get(1);
                case 2 -> {
                    int p = 0;
                    int q = 0;
                    int n = list.get(0).get(0) == 2 ? 2 : 3;
                    if(list.get(0).get(0) == n) {
                        p = list.get(0).get(1);
                        q = list.get(1).get(1);
                    }
                    else {
                        p = list.get(1).get(1);
                        q = list.get(0).get(1);
                    }
                    answer = n == 2 ? (p + q) * Math.abs(p - q) : (int)Math.pow((10 * p + q), 2);
                }
                case 3 -> {
                    int p = 0;
                    int[] qr = new int[2];
                    int len = 0;
                    for(int i = 0; i < list.size(); i++) {
                        if(list.get(i).get(0) == 2) {
                            p = list.get(i).get(1);
                        }
                        else {
                            qr[len++] = list.get(i).get(1);
                        }
                    }
                    answer = qr[0] * qr[1];
                }
                default -> {
                    Collections.sort(list, (list1, list2) -> list1.get(1) - list2.get(1));
                    answer = list.get(0).get(1);
                }
        }
        return answer;
    }
}