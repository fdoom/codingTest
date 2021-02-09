#include <iostream>

using namespace std;

int main(void)
{
	int arr[1000], n;
	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> arr[i];

    /* Bubble sort */
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (arr[i] > arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	for (int i = 0; i < n; i++)
		cout << arr[i] << endl;

	return 0;
}