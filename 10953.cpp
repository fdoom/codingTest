#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int t;
	cin >> t;

	for (int i = 0; i < t; i++)
	{
		int n1, n2;
		char a;

		cin >> n1 >> a >> n2;
		cout << n1 + n2 << endl;
	}
	return 0;
}