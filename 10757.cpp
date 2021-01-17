#include <iostream>
#include <string>

using namespace std;

int main(void)
{
	string a, b;

	cin >> a >> b;
	string result(max(a.length(), b.length()), '0');
	int key = 0;

	for (int i = 0; i < result.length(); i++)
	{
		int sum = key;
		key = 0;

		if (i < a.size())
			sum += a[a.length() - i - 1] - '0';

		if (i < b.size())
			sum += b[b.length() - i - 1] - '0';
		
		if (sum > 9)
		{
			key = 1;
			sum -= 10;
		}
		
		result[result.length() - i - 1] = sum + '0';
	}
	if (key)
		cout << 1;
	cout << result;

    return 0;
}