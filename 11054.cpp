#include <iostream>

using namespace std;

int main(void)
{
	int n, a[1000], left[1000], right[1000];	//n = 수열 a의 크기, a = 입력된 수열, left = 왼쪽부터 시작하는 LIS, right = 오른쪽부터 시작하는 LIS
	int result = 0;
	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> a[i];

	for (int i = 0; i < n; i++)			//왼쪽에서 LIS 알고리즘 적용
	{
		left[i] = 1;
		for (int j = 0; j <= i; j++)
			if (a[j] < a[i] && left[i] < left[j] + 1)
				left[i]++;
	}

	for (int i = n - 1; i >= 0; i--)	//오른쪽부터 LIS 알고리즘 적용
	{
		right[i] = 1;
		for (int j = n - 1; j >= i; j--)
			if (a[j] < a[i] && right[i] < right[j] + 1)
				right[i]++;
	}
	
	for (int i = 0; i < n; i++)			//왼쪽과 오른쪽의 합이 제일 큰 값 찾기
		if (result < left[i] + right[i])
			result = left[i] + right[i];
	cout << result - 1;					//중복되는 중복값 제거로 인한 -1
	return 0;
}