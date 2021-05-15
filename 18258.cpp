#include <iostream>

using namespace std;

class quee {
	int f;
	int b;
	int *arr;
public:
	quee(int n) {
		f = 0;
		b = -1;
		arr = new int[n];
	}
	void push(int n) {
		arr[++b] = n;
	}
	int pop() {
		if (empty()) return -1;
		return arr[f++];
	}
	int size() {
		return b - f + 1;
	}
	int empty() {
		return (b - f) == -1;
	}
	int front() {
		if (empty()) return -1;
		return arr[f];
	}
	int back() {
		if (empty()) return -1;
		return arr[b];
	}
	~quee() {
		delete[] arr;
	}
};
int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	int n;
	cin >> n;

	quee q(n);
	while (n--)
	{
		string command;
		int n;

		cin >> command;

		if (command == "push")
		{
			cin >> n;
			q.push(n);
		}
		else if (command == "pop") cout << q.pop() << '\n';
		else if (command == "size") cout << q.size() << '\n';
		else if (command == "empty") cout << q.empty() << '\n';
		else if (command == "front") cout << q.front() << '\n';
		else if (command == "back") cout << q.back() << '\n';
	}
}