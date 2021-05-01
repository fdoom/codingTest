#include <iostream>
#include <algorithm>

using namespace std;

int main(void)
{
	int t;
	cin >> t;

	while (t--)
	{
		int n1, n2, low = 1;	//low = 최대공약수
		cin >> n1 >> n2;

		for (int i = 2; i <= min(n1, n2); i++)
		{
			if (n1 % i == 0 && n2 % i == 0)
				low = i;
		}
		cout << n2 / low * n1 << endl;
	}
	return 0;
}