#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int board[21][21] = { 0, };
int board_size;
int low = 999999999;
int flag[21] = { 0, };
vector <int> start;
vector <int> link;

void team(int a, int d)
{
	if (a == board_size / 2)
	{
		int S = 0;
		int L = 0;
		
		for (int i = 1; i <= board_size; i++)
		{
			if (!flag[i]) link.push_back(i);
		}
		for (int i = 0; i <board_size / 2; i++)
		{
			for (int j = 0; j < board_size / 2; j++)
			{
				S += board[start[i]][start[j]];
				L += board[link[i]][link[j]];
			}
		}
		if (abs(S - L) < low)
			low = abs(S - L);
		link.clear();
		if (!low)
		{
			cout << low;
			exit(0);
		}
		return;
	}

	for (int i = d; i <= board_size; i++)
	{
		if (flag[i]) continue;
		flag[i] = true;
		start.push_back(i);
		team(a + 1, i);
		start.pop_back();
		flag[i] = false;
	}
}

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cin >> board_size;

	for (int i = 1; i <= board_size; i++)
	{
		for (int j = 1; j <= board_size; j++)
		{
			cin >> board[i][j];
		}
	}
	team(0, 1);
	cout << low;
}