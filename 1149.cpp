#include <iostream>
#define MAX 9999999

using namespace std;

int rgb[3][1000];
int last[3][1000];
int N;
int low = 9999999;

void solution(int deep, int check, int sum)
{
	if (deep == N)
	{
		if (low > sum)
			low = sum;
		return;
	}

	for (int i = 0; i < 3; i++)
	{
		if (check == i) continue;
		else if (last[i][deep] <= sum + rgb[i][deep]) continue;
		else last[i][deep] = sum + rgb[i][deep];
		solution(deep + 1, i, last[i][deep]);
	}
}
int main(void)
{
	cin >> N;

	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			cin >> rgb[j][i];
			last[j][i] = MAX;
		}
	}
	solution(0, 3, 0);
	cout << low;
	return 0;
}