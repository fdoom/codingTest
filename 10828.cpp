#include <iostream>
#include <string>

using namespace std;
int arr[10001];
int index;

void push(int number)
{
	arr[index] = number;
	index++;
}
int size()
{
	return index;
}

int top()
{
	return (!size()) ? -1 : arr[index - 1];
}

bool empty()
{
	return (!size()) ? true : false;
}

void pop()
{
	if (!size())
		cout << -1 << endl;
	else
	{
		cout << arr[index - 1] << endl;
		index--;
	}
}
int main(void)
{
	string com;		//명령어
	int num;		//push할 정수
	int n;			//테스트 케이스 수
	cin >> n;
	
	while (n--)
	{
		cin >> com;
		
		if ("push" == com)
		{
			cin >> num;		//push일 경우에만 정수 입력
			push(num);
		}
		else if ("top" == com)
			cout << top() << endl;
		else if ("size" == com)
			cout << size() << endl;
		else if ("empty" == com)
			cout << empty() << endl;
		else if ("pop" == com)
			pop();
	}
	return 0;
}