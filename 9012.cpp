#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main(void)
{
	int t;
	cin >> t;
	while (t--)
	{
		string arr;
		stack <char> s;
		bool flag = false;
		cin >> arr;

		for (char c : arr)
		{
			if (c == '(') s.push('(');
			else if (s.empty())
			{
				flag = true;
				cout << "NO" << endl;
				break;
			}
			else s.pop();
		}
		if (!flag)
		{
			if (s.empty()) cout << "YES" << endl;
			else cout << "NO" << endl;
		}
	}
	return 0;
}