#include <iostream>

using namespace std;

int main(void)
{
	int n;
	int cnt = 0;
	cin >> n;

	for (int i = n; i > 0; i--)
	{
		for (int j = 0; j < cnt; j++)
			cout << " ";
		for (int j = 0; j < n - cnt; j++)
			cout << "*";
		
		cout << endl;
		cnt++;
	}
	return 0;
}