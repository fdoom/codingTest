import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (l1, l2) -> map.get(l2) - map.get(l1));
        
        List<Integer> answer = new ArrayList<>();
        for(String l : list) {
            int first = -1;
            int second = -1;
            for(int i = 0; i < genres.length; i++) {
                if(l.equals(genres[i])) {
                    if(first == -1) {
                        first = i;
                    }
                    else {
                        if(plays[first] < plays[i]) {
                            second = first;
                            first = i;
                        }
                        else if(second == -1) {
                            second = i;
                        }
                        else if(plays[second] < plays[i]) {
                            second = i;
                        }
                    }
                }
            }
            
            if(first != -1)
                answer.add(first);
            if(second != -1)
                answer.add(second);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}