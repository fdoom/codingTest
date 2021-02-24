#include <iostream>

using namespace std;

typedef struct {
	int x;
	int y;
}Point;

int board[9][9] = { 0, };
int cnt = 0;				//board에 0이 입력된 횟수
Point p[162] = { 0, };		// board에 0이 입력된 좌표 저장

bool check(int x, int y, int key)
{
	for (int i = 0; i < 9; i++)
	{
		if (board[x][i] == key) return false; //세로 열 확인

		if (board[i][y] == key) return false; //가로 열 확인
	}
	for (int i = x / 3 * 3; i < x / 3 * 3 + 3; i++)
		for (int j = y / 3 * 3; j < y / 3 * 3 + 3; j++)
			if (board[i][j] == key)	//한 구역 당 숫자들 중 같은게 있다면
				return false;

	return true;
}

void solution(int a)
{
	if (a == cnt)
	{
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
				cout << board[i][j] << " ";
			cout << endl;
		}
		exit(0);		//정상 종료
	}

	for (int j = 1; j < 10; j++)
	{
		if (!check(p[a].x, p[a].y, j)) continue;

		board[p[a].x][p[a].y] = j;
		solution(a + 1);
		board[p[a].x][p[a].y] = 0;
	}
}

int main(void)
{
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			cin >> board[i][j];
			
			if (!board[i][j])
			{
				p[cnt].x = i;	//0이 입력된 x좌표 저장
				p[cnt].y = j;	//0이 입력된 y좌표 저장
				cnt++;			//0이 입력된 횟수 증가
			}
		}
	}
	solution(0);
	return 0;
}