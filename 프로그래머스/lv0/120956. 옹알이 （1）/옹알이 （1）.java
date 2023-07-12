class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma" };
        int answer = 0;
        boolean check = true;
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(babbling[i].equals(arr[j])) {
                    answer++;
                    check = false;
                    break;
                }
            }
            int cnt = 0;
            if(check) {
                for(int j = 0; j < arr.length; j++){
                    if(babbling[i].contains(arr[j])) {
                        cnt += arr[j].length();
                    }
                }
                if(cnt == babbling[i].length())
                    answer++;
            }
            check = true;
        }
        return answer;
    }
}