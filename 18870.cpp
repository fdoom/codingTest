#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main(void)
{
	int n;
	cin >> n;	//원소의 갯수 입력

	vector <int> v(n);			//원소의 갯수만큼 백터 할당 
	for (int i = 0; i < n; i++)
		cin >> v[i];			//원소 값 입력

	vector <int> r(v);			//기존의 백터 v 복사
	sort(r.begin(), r.end());	//오름차순으로 정렬
	r.erase(unique(r.begin(), r.end()), r.end());			//중복 제거

	for (int i = 0; i < n; i++)
	{
		auto it = lower_bound(r.begin(), r.end(), v[i]);	//입력순으로 입력값 위치 탐색
		cout << it - r.begin() << " ";
	}
}