#include <iostream>
#include <string>

using namespace std;

int main(void)
{
	int N;
	cin >> N;

	string arr;
	cin >> arr;

	int min = N;		//거리 최솟값
	int first;			//왼쪽에 있는 공석 위치
	int last;			//오른쪽에 있는 공석 위치
	for (int i = 0; i < arr.length(); i++)	//첫 번째 공석 위치 찾기
	{
		if (arr[i] == '.') {
			first = i;
			break;
		}
	}

	for (int i = first + 1; i < arr.length(); i++)
	{
		if (arr[i] == '.') {				//오른쪽에 있는 공석 위치 찾기
			last = i;
			if (min > last - first - 1)		//거리의 차이가 최솟값보다 더 작다면 저장
				min = last - first - 1;
			first = last;					//오른쪽에 있는 공석의 위치를 왼쪽에 있는 공석의 위치로 지정
		}
	}
	cout << min;							//최솟값 출력
}