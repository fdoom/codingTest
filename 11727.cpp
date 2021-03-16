#include <iostream>

using namespace std;
int n;
int arr[1001];
int solution(int deep)
{
	if (deep == 0)
		return arr[0] = 1;
	if (deep == 1)
		return arr[1] = 1;
	if (arr[deep])
		return arr[deep];
	else
		return arr[deep] = (solution(deep - 1) + (solution(deep - 2) * 2)) % 10007;
}

int main(void)
{
	cin >> n;

	solution(n);
	cout << arr[n];
	return 0;
}