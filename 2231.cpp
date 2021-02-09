#include <iostream>

using namespace std;

int share(int n, int sum);

int main(void)
{
	int n;
	bool flag = false;
	cin >> n;

	for (int i = 10; i <= n; i++)
	{
		int sum = i;
		sum = share(i, sum);

		if (sum == n)
		{
			cout << i << endl;
			flag = true;
			break;
		}
	}
	if (!flag)
		cout << 0 << endl;

	return 0;
}

int share(int n, int sum)
{
	sum += n % 10;
	n /= 10;

	if (n > 0)
		return share(n, sum);
	else
		return sum;
}