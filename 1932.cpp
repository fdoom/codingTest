#include <iostream>
#include <algorithm>

using namespace std;

int tri[501][501];
int dp[501][501];
int N;

int solution(int deep, int index)
{
	if (deep == N - 1) return tri[deep][index];		//맨 밑에 있는 요소에 접근했을 때
	if (!dp[deep][index])	// 대각선 왼쪽과 오른쪽의 값을 비교 후 더 큰 값을 현재 위치의 값을 더한 결과를 dp에 저장
		dp[deep][index] = max(solution(deep + 1, index), solution(deep + 1, index + 1)) + tri[deep][index];
	return dp[deep][index];		//dp의 값이 있거나 이미 처리가 된 경우
}

int main(void)
{
	cin >> N;

	for (int i = 0; i < N; i++)
		for (int j = 0; j < i + 1; j++)
			cin >> tri[i][j];

	cout << solution(0, 0);
	return 0;
}