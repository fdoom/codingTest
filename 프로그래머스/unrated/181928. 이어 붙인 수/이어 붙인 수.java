class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String even = new String();
        String odd = new String();
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0)
                even = even.concat(String.valueOf(num_list[i]));
            else
                odd = odd.concat(String.valueOf(num_list[i]));
        }
        answer = Integer.valueOf(even) + Integer.valueOf(odd);
        return answer;
    }
}