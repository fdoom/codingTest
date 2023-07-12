class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-", "-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
        String[] word = letter.split("\\s");
        for(int i = 0; i < word.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(word[i].equals(morse[j])) {
                    answer += (char)(j + (int)'a');
                    break;
                }
            }
        }
        return answer;
    }
}