#include <iostream>

using namespace std;

int main(void)
{
	int N;
	int big = 0;
	int small;
	cin >> N;

	for (int i = 0; i < N; i++)
	{
		int num;
		cin >> num;
		if (i == 0) small = num;
		if (num > big) big = num;
		if (num < small) small = num;
	}
	cout << big * small;
	return 0;
}