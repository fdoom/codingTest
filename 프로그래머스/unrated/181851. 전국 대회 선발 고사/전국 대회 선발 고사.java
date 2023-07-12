import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < attendance.length; i++) {
        	ArrayList<Integer> temp = new ArrayList<Integer>();
            if(attendance[i]) {
                temp.add(rank[i]);
                temp.add(i);
                list.add(temp);
            }
        }
        
        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                return list1.get(0) - list2.get(0);
            }
        });
        
        int answer = list.get(0).get(1) * 10000 + list.get(1).get(1) * 100 + list.get(2).get(1);
        return answer;
    }
}