#include <iostream>

using namespace std;

int main(void)
{
	int n, m, k;
	int a[101][101], b[101][101], r[101][101] = { 0, };

	//행렬 a입력
	cin >> n >> m;
	for (int i = 0; i < n; i++)
		for (int j = 0; j < m; j++)
			cin >> a[i][j];

	//행렬 b입력
	cin >> m >> k;
	for (int i = 0; i < m; i++)
		for (int j = 0; j < k; j++)
			cin >> b[i][j];

	//행렬의 곱 실행
	for (int i = 0; i < n; i++)
		for (int j = 0; j < k; j++)
			for (int u = 0; u < m; u++)
				r[i][j] += a[i][u] * b[u][j];

	//출력
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < k; j++)
			cout << r[i][j] << " ";
		cout << endl;
	}
}
