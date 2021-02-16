#include <iostream>
#include <string>

using namespace std;

int main(void)
{
	string number;
	int arr[10] = { 0, };
	cin >> number;

	for (int i = 0; i < number.length(); i++)
		arr[number[i] - '0']++;

	for (int i = 9; i >= 0; i--)
		for (int j = 0; j < arr[i]; j++)
			cout << i;
    
	return 0;
}