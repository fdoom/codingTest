#include <iostream>
#define MAX 2187
using namespace std;

int N;
int arr[MAX][MAX];
int result[3];

void solve(int row, int col, int size)
{
	if (size == 1)
	{
		result[arr[row][col] + 1]++;
		return;
	}

	bool m = true;		//음수 일 때
	bool z = true;		//0일 때
	bool p = true;		//양수 일 때

	for (int i = row; i < row + size; i++)
	{
		for (int j = col; j < col + size; j++)
		{
			switch (arr[i][j])
			{
			case -1: z = false; p = false; break;
			case 0: m = false; p = false; break;
			default: m = false; z = false; break;
			}
		}
	}
	if (m) result[0]++;
	else if (z) result[1]++;
	else if (p) result[2]++;
	else
	{
		size /= 3;
		solve(row, col, size);
		solve(row, col + size, size);
		solve(row, col + 2 * size, size);

		solve(row + size, col, size);
		solve(row + size, col + size, size);
		solve(row + size, col + 2 * size, size);

		solve(row + 2 * size, col, size);
		solve(row + 2 * size, col + size, size);
		solve(row + 2 * size, col + 2 * size, size);
	}
	return;
}
int main(void)
{
	cin >> N;

	for (int i = 0; i < N; i++)
		for (int j = 0; j < N; j++)
			cin >> arr[i][j];
	solve(0, 0, N);

	for (int i = 0; i < 3; i++)
		cout << result[i] << '\n';
	return 0;
}