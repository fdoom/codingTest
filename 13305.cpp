#include <iostream>

using namespace std;
long long liter[100000];
int main(void)
{
	int n;
	long long cost;
	long long temp;
	long long sum = 0;
	cin >> n;
	for (int i = 0; i < n - 1; i++)
		cin >> liter[i];
	for (int i = 0; i < n - 1; i++)
	{
		cin >> cost;
		if (i == 0) temp = cost;
		if (cost < temp)
			temp = cost;
		sum += temp * liter[i];
	}
	cout << sum;
    return 0;
}