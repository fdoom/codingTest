#include <iostream>
#include <algorithm>

using namespace std;

int main(void)
{
	int n;
	cin >> n;

	int cnt1 = 0;		//2로 나누는 경우
	int cnt2 = 0;		//5로 나누는 경우
	
	for (int i = 2; i <= n; i++)
	{
		int temp = i;						//i의 값 임시 저장
		while (i % 2 == 0 || i % 5 == 0)	//2와 5로 나눌 수 없을 때까지 반복
		{
			if (i % 2 == 0)
			{
				i /= 2;
				cnt1++;
			}
			else if (i % 5 == 0)
			{
				i /= 5;
				cnt2++;
			}
		}
		i = temp;
	}
	cout << min(cnt1, cnt2);	//가장 적은 수
}