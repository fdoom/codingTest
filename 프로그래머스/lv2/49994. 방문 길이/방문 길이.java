class Solution {
    static int answer = 0;
    public int solution(String dirs) {
		int[][] move = {
				{1, 0},
				{-1, 0},
				{0, 1},
				{0, -1}
		};
		boolean[][][][] visit = new boolean[11][11][11][11];
		int[] position = {5, 5};
		for(char c : dirs.toCharArray()) {
			switch(c) {
			case 'U' -> moving(position, move[0], visit);
			case 'D' -> moving(position, move[1], visit);
			case 'R' -> moving(position, move[2], visit);
			case 'L' -> moving(position, move[3], visit);
			}
		}
        return answer;
    }
    
	private static void moving(int[]p, int[] m, boolean[][][][] v) {
		if((p[0] + m[0]) <= 10 && (p[0] + m[0]) >= 0 && (p[1] + m[1]) <= 10 && (p[1] + m[1]) >= 0) {
			int[] temp1 = p.clone();
			p[0] += m[0];
			p[1] += m[1];
			int[] temp2 = p.clone();
			if(!v[temp2[0]][temp2[1]][temp1[0]][temp1[1]] && !v[temp1[0]][temp1[1]][temp2[0]][temp2[1]]) {
				v[temp2[0]][temp2[1]][temp1[0]][temp1[1]] = true;
				v[temp1[0]][temp1[1]][temp2[0]][temp2[1]] = true;
				answer++;
			}
		}
	}
}