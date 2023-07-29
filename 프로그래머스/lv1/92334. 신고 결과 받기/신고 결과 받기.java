import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map <String, Integer> id = new HashMap<>();
		for(int i = 0; i < id_list.length; i++)
			id.put(id_list[i], i);
		
		boolean[][] count = new boolean[id_list.length][id_list.length];
		for(String r : report) {
            String[] temp = r.split(" ");
            count[id.get(temp[0])][id.get(temp[1])] = true;
        }
		
		int[] answer = new int[id_list.length];
		for(int i = 0; i < count.length; i++) {
			int cnt = 0;
			int[] temp = answer.clone();
			for(int j = 0; j < count.length; j++) {
				if(count[j][i]) {
					cnt++;
					temp[j]++;
				}
			}
			if(cnt >= k)
				answer = temp.clone();
		}
        return answer;
    }
}