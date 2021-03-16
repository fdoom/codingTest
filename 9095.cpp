#include <iostream>

using namespace std;

int main(void)
{
	int t;
	int n;
	int arr[11] = { 1, 1, 2 };

	cin >> t;
	for (int i = 3; i < 11; i++)
		arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];

	for (int i = 0; i < t; i++)
	{
		cin >> n;
		cout << arr[n] << endl;
	}
	return 0;
}