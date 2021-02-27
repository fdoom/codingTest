#include <iostream>

using namespace std;

long arr[101] = { 0, 1, 1 };

long solution(int n)
{
	if (n == 0) return 0;
	else if (n == 1) return 1;
	else if (arr[n]) return arr[n];
	else return arr[n] = solution(n - 2) + solution(n - 3);
}

int main(void)
{
	int T, N;
	cin >> T;

	for (int i = 0; i < T; i++)
	{
		cin >> N;
		cout << solution(N) << "\n";
	}
	return 0;
}