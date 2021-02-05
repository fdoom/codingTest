#include <iostream>
#include <string>

using namespace std;

int main(void)
{
	int n, cnt = 0;
	cin >> n;

	for (int i = 666; ; i++)
	{
		if (to_string(i).find("666") != string::npos)
			cnt++;
		if (n == cnt)
		{
			cout << i;
			break;
		}
	}
	return 0;
}