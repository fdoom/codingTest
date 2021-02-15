#include <iostream>
#include <string>
using namespace std;

int n, m;
string arr;

void solution(int position)
{
	if (position == m)
	{
		for (int i = 0; i < m; i++)
			cout << arr[i] << " ";
		cout << "\n";
		return;
	}

	for (int i = 1; i <= n; i++)
	{
		arr.push_back(i + '0');
		solution(position + 1);
		arr.pop_back();
	}
}

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> n >> m;
	solution(0);
	return 0;
}