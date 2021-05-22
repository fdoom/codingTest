#include <iostream>

using namespace std;

int n;
int arr[128][128];
int b, w;

void solve(int row, int col, int size)
{
	int check = arr[row][col];

	for (int i = row; i < row + size; i++)
	{
		for (int j = col; j < col + size; j++)
		{
			if (check == 0 && arr[i][j] == 1) check = 2;
			else if (check == 1 && arr[i][j] == 0) check = 2;

			if (check == 2)
			{
				solve(row, col, size / 2);	//1 사분면
				solve(row, col + size / 2, size / 2); //2 사분면
				solve(row +size / 2, col, size / 2); //3 사분면
				solve(row + size / 2, col + size / 2, size / 2); //4 사분면
				return;
			}
		}
	}
	if (check == 0) w++;
	else b++;
}
int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	cin >> n;
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++)
			cin >> arr[i][j];

	solve(0, 0, n);
	cout << w << endl << b;
}