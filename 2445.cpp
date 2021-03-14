#include <iostream>

using namespace std;

int main(void)
{
	int n;
	int cnt = 0;
	cin >> n;
	
	for (int i = 0; i < n * 2 - 1; i++)
	{
		if (i >= n) cnt--;
		else cnt++;
		for (int j = 0; j < n; j++)
		{
			if (cnt > j)
				cout << "*";
			else cout << " ";
		}
		for (int j = n; j > 0; j--)
		{
			if (cnt < j)
				cout << " ";
			else cout << "*";
		}
		cout << endl;
	}
	return 0;
}