#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void) {
	int t;
	cin >> t;

	while (t--)
	{
		int n;
		cin >> n;
		string temp;
		vector <string> r(n);		//의상 종류 저장
		for (int i = 0; i < n; i++)
			cin >> temp >> r[i];

		vector <string> a(r);		//벡터 r 복사

		sort(r.begin(), r.end());	//오름차순으로 정렬 
		r.erase(unique(r.begin(), r.end()), r.end()); //중복 제거
		
		vector <int> q(n);
		for (int i = 0; i < r.size(); i++)	//의상 종류당 갯수 확인
			for (int j = 0; j < n; j++)
				if (r[i] == a[j])
					q[i]++;

		int sum = 1;
		for (int i = 0; i < r.size(); i++)	// (의상 종류당 갯수 + 해당 옷)
			sum *= (q[i] + 1);

		cout << sum - 1 << endl;			//알몸인 상태 제거
	}
}