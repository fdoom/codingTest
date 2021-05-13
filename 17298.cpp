#include <iostream>
#include <vector>

using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);

	int n;
	cin >> n;

	int* a = new int[n];
	int* b = new int[n];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
		b[i] = -1;
	}
	vector <int> c;
	for (int i = 0; i < n; i++)
	{
		while (!c.empty() && a[c.back()] < a[i])
		{
			b[c.back()] = a[i];
			c.pop_back();
		}
		c.push_back(i);
	}
	for (int i = 0; i < n; i++) cout << b[i] << " ";
	delete[] a;
	delete[] b;
}