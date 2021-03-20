#include <iostream>

using namespace std;

int n, k, sum;
int arr[10];

int main(void)
{
	cin >> n >> k;
	for (int i = 0; i < n; i++)
		cin >> arr[i];

	for (int i = n - 1; i >= 0; i--)
	{
		if (k >= arr[i])
		{
			sum += k / arr[i];
			k %= arr[i];
		}
	}
	cout << sum;
	return 0;
}