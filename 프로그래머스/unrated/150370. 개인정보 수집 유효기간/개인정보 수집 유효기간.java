import java.util.*;
class Solution {
    public List <Integer> solution(String today, String[] terms, String[] privacies) {
        List <Integer> answer = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            int year = Integer.parseInt(privacies[i].substring(0, 4));
            int month = Integer.parseInt(privacies[i].substring(5, 7));
            int day = Integer.parseInt(privacies[i].substring(8, 10));
            int term = 0;
            
            for(int j = 0; j < terms.length; j++) {
                if(privacies[i].charAt(11) == terms[j].charAt(0)) {
                    term = Integer.parseInt(terms[j].substring(2));
                    break;
                }
            }
            
            for(int j = 1; j <= term * 28; j++) {
                if(++day > 28) {
                    day = 1;
                    if(++month > 12) {
                        month = 1;
                        year++;
                    }
                }
            }
            
            StringBuilder limit = new StringBuilder();
            limit.append(year);
            if(month < 10) limit.append(".0").append(month);
            else limit.append(".").append(month);
            
            if(day < 10) limit.append(".0").append(day);
            else limit.append(".").append(day);
            
            if(limit.toString().compareTo(today) <= 0)
                answer.add(i + 1);
        }
        return answer;
    }
}