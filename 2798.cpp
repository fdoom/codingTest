#include <iostream>

using namespace std;

int main(void)
{
	int card[100], N, M, result = 0;

	cin >> N >> M;

	for (int i = 0; i < N; i++)
		cin >> card[i];

	for (int i = 0; i < N; i++)
	{
		for (int j = i + 1; j < N; j++)
		{
			for (int k = j + 1; k < N; k++)
			{
				int sum = card[i] + card[j] + card[k];

				if (sum <= M && sum > result)
					result = sum;
			}
		}
	}
	cout << result;
    return 0;
}