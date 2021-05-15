#include <iostream>

using namespace std;

class card {
	int f;
	int b;
	int *arr;
public:
	card(int n) {
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
	~card() {
		delete[] arr;
	}
};
int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	int n;
	cin >> n;

	card q(n * 2);

	for (int i = 1; i <= n; i++) q.push(i);

	while (q.size() != 1)
	{
		q.pop();
		q.push(q.pop());
	}
	cout << q.pop();
}