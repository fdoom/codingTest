#include <iostream>

using namespace std;

bool board[15][15] = { 0, };
int n, result = 0;

bool search(int x, int y)
{
	for (int i = 0; i < n; i++)
	{
		if (board[x][i] || board[i][y]) return true; // 가로 세로 열 체크

		if (x + i < n)		// 왼쪽 (위) 오른쪽(아래) 대각선 체크
		{
			if (y + i < n && board[x + i][y + i]) return true; 
			if (y - i >= 0 && board[x + i][y - i]) return true;
		}

		//왼쪽(아래) 오른쪽(위) 대각선 체크
		if (y + i < n && x - i >= 0 && board[x - i][y + i]) return true;
		if (x - i >= 0 && y - i >= 0 && board[x - i][y - i]) return true;
	}
	return false;
}

void solution(int p)
{
	if (p == n) result++;
	else
	{
		for (int y = 0; y < n; y++)
		{
			if (!board[p][y])
			{
				if (search(p, y)) continue;
				board[p][y] = true;

				solution(p + 1);
				board[p][y] = false;
			}
		}
	}
}

int main(void)
{
	cin >> n;
	solution(0);
	cout << result;
    return 0;
}