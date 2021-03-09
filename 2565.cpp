#include <iostream>
#include <algorithm>

using namespace std;


typedef struct {
	int left;
	int right;
}LINE;

bool compare(LINE a, LINE b)		//정렬 기준 오름차순
{
	return a.left < b.left;
}

int main(void)
{
	int dp[101];
	LINE line[101] = { 0, };
	int n, result = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> line[i].left >> line[i].right;

	sort(line, line + n, compare);

	for (int i = 0; i < n; i++)		//right의 LIS 구하기
	{
		dp[i] = 1;
		for (int j = 0; j <= i; j++)
		{
			if (line[i].right > line[j].right && dp[i] < dp[j] + 1)
				dp[i]++;
		}
		result = max(result, dp[i]);
	}
	cout << n - result;
	return 0;
}