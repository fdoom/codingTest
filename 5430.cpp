#include <iostream>
#include <string>
#include <deque>
#include <algorithm>
using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	int t;
	cin >> t;

	while (t--)
	{
		string command;		//명령어 입력
		cin >> command;
		
		int n;				//입력할 수의 갯수
		cin >> n;

		deque <int> d;		//배열의 요소 입력
		string temp;		//배열 입력
		cin >> temp;

		for (int i = 0; i < temp.length(); i++)		//배열 요소 덱에 저장
		{
			bool flag = true;
			if (temp[i] == '[' || temp[i] == ',' || temp[i] == ']') continue;		//수가 아닐 경우 제외
			if (temp[i - 1] >= '0' && temp[i - 1] <= '9')							//이전의 요소가 수일 경우
			{
				int a = d.back() * 10 + temp[i] - '0';								//10배 증가 후 더하고 다시 넣기
				d.pop_back();
				d.push_back(a);
				flag = false;
			}
			if(flag) d.push_back(temp[i] - '0');									//이전의 수가 없다면 바로 넣기
		}
		bool e = false;	//에러 체크
		bool r = true;	//반전 명령어 확인
		for (int i = 0; i < command.length(); i++)	//명령어 수행
		{
			if (command[i] == 'D')
			{
				if (d.empty()) {		//비어있다면 에러 메세지 출력 후 종료
					cout << "error";
					e = true;
					break;
				}
				if (!r) d.pop_back();	//반전상태라면 제일 뒤에 있는 값 제외
				else d.pop_front();		//아니라면 제일 앞에 있는 값 제외
			}
			if (command[i] == 'R') r = !r;	//반전 여부 결정
		}
		
		if (!e) {			//에러 메세지가 발생안했다면
			cout << '[';
			if (!d.empty()) {
				if (!r) reverse(d.begin(), d.end());		//반전 상태라면 반전 시킨 후 출력
				for (int i = 0; i < d.size() - 1; i++)
					cout << d[i] << ",";
				cout << d[d.size() - 1];
			}
			cout << ']';
		}
		cout << '\n';
	}
	return 0;
}