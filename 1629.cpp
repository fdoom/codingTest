#include <iostream>

using namespace std;

long long solve(long long a, long long b, long long c)
{
	a %= c;

	if (b == 0) return 1;
	else if (b == 1) return a;
	else if (b % 2 == 0) {
		long long temp = solve(a, b / 2, c);
		return temp * temp % c;
	}
	else return a * solve(a, b - 1, c) % c;
}

int main(void)
{
	long long a, b, c;
	cin >> a >> b >> c;
	cout << solve(a, b, c) << endl;
}