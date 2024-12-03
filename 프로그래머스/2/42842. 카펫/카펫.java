class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow; // 전체 격자 수
        
        // 세로 길이(height)는 최소 3부터 시작 (테두리가 갈색으로 둘러싸여야 하므로)
        for (int height = 3; height <= total / height; height++) {
            if (total % height == 0) { // 전체 크기가 가로*세로로 나눠 떨어지는 경우
                int width = total / height; // 가로 길이
                
                // 노란색 영역 확인
                int yellowArea = (width - 2) * (height - 2);
                if (yellowArea == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        return answer; // 예외 상황 (문제 조건상 발생하지 않음)
    }
}
