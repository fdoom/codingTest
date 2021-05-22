#include <iostream>
#include <string>

using namespace std;

int n;
string arr[64];

void solve(int row, int col, int size)
{
	char check = arr[row][col];

	for (int i = row; i < row + size; i++)
	{
		for (int j = col; j < col + size; j++)
		{
			if (arr[i][j] != check)
			{
				cout << "(";
				solve(row, col, size / 2);							//1 사분면
				solve(row, col + size / 2, size / 2);				//2 사분면
				solve(row +size / 2, col, size / 2);				//3 사분면
				solve(row + size / 2, col + size / 2, size / 2);	//4 사분면
				cout << ")";
				return;
			}
		}
	}
	cout << check;
}
int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> arr[i];

	solve(0, 0, n);
}