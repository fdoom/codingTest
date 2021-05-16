#include <iostream>

using namespace std;

class quee {
	int f;
	int b;
	int* arr;
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
	~quee() {
		delete[] arr;
	}
};
int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	int n, limit;
	cin >> n >> limit;

	quee q(n * n);
	for (int i = 1; i <= n; i++) q.push(i);
	cout << "<";
	while (q.size() != 1)
	{
		for (int i = 0; i < limit - 1; i++)
			q.push(q.pop());
		cout << q.pop() << ", ";
	}
	cout << q.pop() << ">";
	return 0;
}