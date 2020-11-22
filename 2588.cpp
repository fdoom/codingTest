#include <iostream>

using namespace std;

int main(void)
{
	int A, B, n1, n2, n3;

	cin >> A >> B;

	n1 = A * (B % 10);
	cout << n1 << endl;

	n2 = A * ((B % 100) - (B % 10)) / 10;
	cout << n2 << endl;

	n3 = A * (B / 100);
	cout << n3 << endl;

	cout << n3 * 100 + n2 * 10 + n1;
	return 0;
}