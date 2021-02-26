#include <iostream>
 
using namespace std;
 
int arr[1000001] = { 0, 1, 2 };
 
int solution(int n)
{
	if (n == 0) return 0;
	else if (n == 1)return 1;
	else if (arr[n]) return arr[n];
	else return arr[n] = (solution(n - 1) + solution(n - 2)) % 15746;
}

int main(void)
{
	int N;
	cin >> N;
	cout << solution(N);
	return 0;
}