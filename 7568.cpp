#include <iostream>

using namespace std;

int main(void)
{
	int arr[50][2];
	int n;
	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> arr[i][0] >> arr[i][1];

	for (int i = 0; i < n; i++)
	{
		int cnt = 0;

		for (int j = 0; j < n; j++)
			if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
				cnt++;
		cout << ++cnt << " ";
	}

	return 0;
}