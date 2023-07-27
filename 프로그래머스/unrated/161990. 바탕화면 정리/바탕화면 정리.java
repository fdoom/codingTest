import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        Arrays.fill(answer, -1);
        for(int i = 0; i < wallpaper.length; i++) {
            if(answer[0] != -1 && answer[2] != -1)
                break;
            if(wallpaper[i].contains("#") && answer[0] == -1)
                answer[0] = i;
            if(wallpaper[wallpaper.length - i - 1].contains("#") && answer[2] == -1)
                answer[2] = wallpaper.length - i;
        }
        
        for(int i = 0; i < wallpaper[0].length(); i++) {
            for(int j = 0; j < wallpaper.length; j++) {
                if(answer[1] != -1 && answer[3] != -1)
                    break;
                if(wallpaper[j].charAt(i) == '#' && answer[1] == -1)
                    answer[1] = i;
                if(wallpaper[j].charAt(wallpaper[0].length() - i - 1) == '#' && answer[3] == -1)
                    answer[3] = wallpaper[0].length() - i;
            }
        }
        return answer;
    }
}