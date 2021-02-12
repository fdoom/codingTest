#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int cmp(const string& a, const string& b)
{
	if (a.length() == b.length())			//길이가 같다면
		return a < b;						//사전 순으로 올림차순
	else
		return a.length() < b.length();		//길이 순으로 올림차순
}

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);

	int n;
	cin >> n;

	string* word = new string[n];

	for (int i = 0; i < n; i++)
		cin >> word[i];

	sort(word, word + n, cmp);

	for (int i = 0; i < n; i++)
	{
		cout << word[i] << '\n';
		while (word[i] == word[i + 1]) i++;		//현재 문장과 다음 문자이 같다면 다음 문장으로 접근(중복 방지)
	}

	delete[] word;
	return 0;
}