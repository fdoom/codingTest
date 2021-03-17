#include <iostream>
#include <algorithm>

using namespace std;

int dp[100001];
int arr[100001];

int main(void)
{
	int n;
	int result = 0;
	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> arr[i];
	result = dp[0] = arr[0];

	for (int i = 1; i < n; i++)
	{
		dp[i] = max(dp[i - 1] + arr[i], arr[i]);
		result = max(result, dp[i]);
	}
	cout <<result;
	return 0;
}