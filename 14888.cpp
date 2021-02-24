#include <iostream>
#include <vector>

using namespace std;

vector <int> operand;	//피연산자 저장
vector <int> op;		//연산자 저장
vector <bool> flag;		//연산자 사용여부
int low = 100000000;	//최솟값
int hight = -100000000;	//최댓값
int AC = 0;				//계산 결과

void solution(int a)
{
	if (a == op.size())
	{
		if (hight < AC) hight = AC;		//계산 결과가 크다면
		if (low > AC) low = AC;			//계산 결과가 작다면
		return;
	}
	if (a == 0) AC = operand[0];		//첫 계산일 경우 첫 번째 피연산자로 초기화
	for (int i = 0; i < op.size(); i++)	
	{
		if (flag[i]) continue;			//해당 연산자를 사용하였는가?
		int buffer = AC;				//재귀 함수 종료에 따른 AC 백업

		switch (op[i])					//연산자에 맞춰서 계산
		{
		case 0:
			AC += operand[a + 1];
			break;
		case 1:
			AC -= operand[a + 1];
			break;
		case 2:
			AC *= operand[a + 1];
			break;
		case 3:
			AC /= operand[a + 1];
		default:
			break;
		}

		flag[i] = true;		//연산자 사용 처리
		solution(a + 1);

		AC = buffer;		//계산 결과 백업
		flag[i] = false;	//연산자 미사용 처리
	}
}

int main(void)
{
	int n;
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		int num;
		cin >> num;
		operand.push_back(num);		//피연산자 저장
	}

	for (int i = 0; i < 4; i++)
	{
		int operation;
		cin >> operation;

		if (operation)
		{
			for(int j = 0; j < operation; j++)
			{
				flag.push_back(false);	//연산자 사용여부 저장
				switch (i)
				{
				case 0:		// +
					op.push_back(0);
					break;
				case 1:		// -
					op.push_back(1);
					break;
				case 2:		// ÷
					op.push_back(2);
					break;
				case 3:		// ×
					op.push_back(3);
					break;
				default:
					break;
				}
			}
		}
	}
	solution(0);

	cout << hight << endl << low;
	return 0;
}