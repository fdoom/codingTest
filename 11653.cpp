#include <iostream>

using namespace std;

int main(void)
{
	int n;
	cin >> n;		//정수 n입력

	//n이 1이하일 경우에만 정지
	while (n > 1)	
	{
		for (int i = 2; i <= n; i++)	//2부터 n까지 반복
		{
			if (n % i == 0)				//반복 도중 n에 나누어 떨어지는 경우
			{
				n /= i;					//n을 i에 나눈 값을 저장
				cout << i << endl;		//소인수 분해 결과 = i 출력
				break;					//n의 크기 검사를 위해 반복 중지
			}
		}
	}
}