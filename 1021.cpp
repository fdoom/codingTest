#include <iostream>
#include <deque>

using namespace std;

int main()
{
	int n, m, sum = 0;
	int *arr;

	cin >> n >> m;
	arr = new int[m];
	deque <int> d;
	for (int i = 0; i < n; i++)			//1부터 n까지 입력
		d.push_back(i + 1);

	for (int i = 0; i < m; i++)			//찾고자하는 수 입력
		cin >> arr[i];
	
	for (int i = 0; i < m; i++)
	{
		int cnt1 = 0, cnt2 = 0;
		deque <int> d1(d);
		deque <int> d2(d);

		while (d1.front() != arr[i])	//오른쪽 방향으로 진행
		{
			d1.push_back(d1.front());
			d1.pop_front();
			cnt1++;
		}

		while (d2.back() != arr[i])		//왼쪽 방향으로 진행
		{
			d2.push_front(d2.back());
			d2.pop_back();
			cnt2++;
		}

		if (cnt1 > cnt2)		//왼쪽 방향으로 가는 것이 빠른 경우
		{
			sum += cnt2 + 1;
			d2.pop_back();
			d = d2;
		}
		else					//오른쪽 방향으로 가는 것이 빠른 경우
		{
			sum += cnt1;
			d1.pop_front();
			d = d1;
		}
	}
	cout << sum;
	delete[]arr;
}