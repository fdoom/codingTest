import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack <Integer> stack = new Stack<>();
        String[] s1 = dartResult.split("[^0-9]+");          //문자 사이에 있는 숫자로만 구성
        String[] s2 = dartResult.split("[0-9]+");           //숫자 사이에 있는 문자로만 구성
        
        for(int i = 0; i < s1.length; i++) {
            int num = Integer.parseInt(s1[i]);
            int index = i + 1;                              //첫번째 문자열은 공백이기에 제외
            while(!s2[index].isBlank()) {
                if(s2[index].matches("S(.*)"))
                    stack.push(num);
                else if(s2[index].matches("D(.*)")) {
                    num *= num;
                    stack.push(num);
                }
                else if(s2[index].matches("T(.*)")) {
                    num *= num * num;
                    stack.push(num);
                }
                else if(s2[index].matches("#(.*)")) {
                    stack.push(stack.pop() * -1);
                }
                else {                                      //스타상(*)일 때
                    if(stack.size() >= 2) {                 //이미 두 개 이상의 점수를 획득했을 때
                        int temp1 = stack.pop() * 2;
                        int temp2 = stack.pop() * 2;
                        stack.push(temp2);
                        stack.push(temp1);
                    }
                    else                                    //획득한 점수가 1개일 때
                        stack.push(stack.pop() * 2);
                }
                s2[index] = s2[index].substring(1);         //첫 번째 문자 제거
            }
        }
        while(!stack.isEmpty())                             //계산 결과 전부 더하기
            answer += stack.pop();
        return answer;
    }
}