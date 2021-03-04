#include <iostream>
#define MIN 1000000000

using namespace std;

int main(void)
{
	int n, sum = 0;
	int dp[101][10] = { 0, };
	cin >> n;
	for (int i = 0; i < 10; i++)
		dp[1][i] = 1;

	for (int i = 2; i <= n; i++)
	{
		for (int j = 0; j < 10; j++)
		{
			if (j == 0) dp[i][0] = dp[i - 1][1] % MIN;        //수가 0일 경우
			else if (j == 9) dp[i][9] = dp[i - 1][8] % MIN;   //수가 9일 겨우
			else dp[i][j] = (dp[i - 1][j + 1] + dp[i - 1][j - 1]) % MIN;    //수가 1~8일 경우
		}
	}
	for (int i = 1; i < 10; i++)
		sum = (sum + dp[n][i]) % MIN;
	cout << sum;
    return 0;
}