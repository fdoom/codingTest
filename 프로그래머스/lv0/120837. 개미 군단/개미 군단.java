class Solution {
    static int answer;
    public void check(int lastHp, int ant, int addAnt) {
        if(lastHp == 0) {
            ant += addAnt;
            answer = answer < ant ? answer : ant;
        }
    }
    
    public int solution(int hp) {
        answer = hp;
    	for(int i = hp; i >= 0; i--) {
    		int ant = i;
    		for(int j = 0; hp - i - j * 3 >= 0; j++) {
                check(hp - i - j * 3, ant, j);
    			for(int k = 0; hp - i - j * 3 - k * 5 >= 0; k++) {
                    check(hp - i - j * 3 - k * 5, ant, j + k);
    			}
    		}
    	}
        return answer;
    }
}