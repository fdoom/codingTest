#include <iostream>

using namespace std;

int main(void)
{
	int n1, n2;
	int low = 1, high;
	int limit;
	cin >> n1 >> n2;
	limit = n1 > n2 ? n1 : n2;
	
	for (int i = 2; i <= limit; i++)
	{
		if (n1 % i == 0 && n2 % i == 0)
			low = i;
	}
	high = n1 * n2 / low;
	cout << low << endl << high;
	return 0;
}