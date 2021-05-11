#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main(void)
{
	while (1)
	{
		string arr;	//원본
		string brr;	//괄호만
		getline(cin, arr, '.');	//'.'이 입력되는 순간까지만 입력
		bool flag = true;		//true라면 yes, false라면 no
		if (arr.empty()) break;	//아무것도 없다면 종료

		for (int i = 0; i < arr.length(); i++)
		{
			if (arr[i] == '(' || arr[i] == '[')		//열린 괄호는 전부 push
				brr.push_back(arr[i]);
			else if (arr[i] == ']')
			{
				if (brr.empty() || brr[brr.length() - 1] != '[')	//비어있거나 열린 대괄호가 아니라면 비교 중지
				{
					flag = false;
					break;
				}
				else brr.pop_back();
			}
			else if (arr[i] == ')')
			{
				if (brr.empty() || brr[brr.length() - 1] != '(')	//비어있거나 열린 소괄호가 아니라면 비교 중지
				{
					flag = false;
					break;
				}
				else brr.pop_back();
			}
		}
		if (flag && brr.empty()) cout << "yes" << endl;		//brr에 괄호가 없고 중간에 정지되지 않았다면 yes
		else cout << "no" << endl;
		cin.ignore();		//입력 버퍼 비워주기
	}
}