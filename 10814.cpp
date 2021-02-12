#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

typedef struct {
	int num;		//입력 순서 저장
	int age;
	string name;
}Person;

int cmp(const Person& a, const Person& b)
{
	if (a.age == b.age) return a.num < b.num;	//나이가 같다면 입력 순으로 올림차순
	else return a.age < b.age;					//나이순으로 올림차순
}
int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);

	int n;
	cin >> n;

	Person* arr = new Person[n];

	for (int i = 0; i < n; i++)
	{
		cin >> arr[i].age >> arr[i].name;
		arr[i].num = i;
	}

	sort(arr, arr + n, cmp);

	for (int i = 0; i < n; i++)
		cout << arr[i].age << " " << arr[i].name << '\n';

	delete[] arr;
	return 0;
}