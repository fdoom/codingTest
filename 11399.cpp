#include <iostream>
#include <algorithm>

using namespace std;

int main(void)
{
	int n;
	int arr[1001];
	int result[1001];
	int sum;

	cin >> n;
	for (int i = 0; i < n; i++) cin >> arr[i];

	sort(arr, arr + n);
	sum = result[0] = arr[0];
	for (int i = 1; i < n; i++)
	{
		result[i] = result[i - 1] + arr[i];
		sum += result[i];
	}
	cout << sum;
	return 0;
}