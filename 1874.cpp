#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int main(void)
{
	vector <int> arr;
	vector <char> result;
	int n, index = 0;
	cin >> n;

	int* temp = new int[n];
	for (int i = 0; i < n; i++) cin >> temp[i];

	for (int i = 1; i <= n; i++)
	{
		arr.push_back(i);
		result.push_back('+');

		while (!arr.empty() && temp[index] == arr.back())
		{
			arr.pop_back();
			result.push_back('-');
			index++;
		}
	}
	if (!arr.empty()) cout << "NO";
	else
	{
		for (int i = 0; i < result.size(); i++)
			cout << result[i] << '\n';
	}
	delete[] temp;
}