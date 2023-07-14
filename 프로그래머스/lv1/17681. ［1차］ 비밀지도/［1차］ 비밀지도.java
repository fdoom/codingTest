class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            String zero = "0";
            
            if(s1.length() < n)
                s1 = zero.repeat(n - s1.length()) + s1;
            if(s2.length() < n)
                s2 = zero.repeat(n - s2.length()) + s2;
            
            answer[i] = "";
            for(int j = 0; j < n; j++) {
                if(s1.charAt(j) == '1' || s2.charAt(j) == '1')
                    answer[i] += "#";
                else
                    answer[i] += " ";
            }
        }
        return answer;
    }
}