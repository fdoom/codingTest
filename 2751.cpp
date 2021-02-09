#include <iostream>

using namespace std;

void mergeSort(int a[], int left, int right);
void merge(int a[], int left, int mid, int right);

int arr[1000000];
int b[1000000];

int main(void)
{
	int n;
	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> arr[i];

	mergeSort(arr, 0, n - 1);		//배열의 요소 분할

	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";
	return 0;
}

void mergeSort(int a[], int left, int right)		//배열의 요소 분할 함수
{
	int mid = (left + right) / 2;

	if (left < right)
	{
		mergeSort(a, left, mid);			//mid를 기준으로 왼쪽 배열의 요소 분할
		mergeSort(a, mid + 1, right);		//mid를 기준으로 오른쪽 배여르이 요소 분할
		merge(a, left, mid, right);			//분할된 왼쪽 배열과 오른쪽 배열 병합
	}
}

void merge(int a[], int left, int mid, int right)	//분할된 배열의 요소 병합 함수
{
	int g1Start = left;			//분할된 왼쪽 배열의 시작점
	int g2Start = mid + 1;		//분할된 오른쪽 배열의 시작점
	int index = 0;				//배열 b의 index값

	while (g1Start <= mid && g2Start <= right)
	{
		if (a[g1Start] <= a[g2Start])		//분할된 왼쪽 배열과 오른쪽 배열의 요소 비교
			b[index++] = a[g1Start++];
		else
			b[index++] = a[g2Start++];
	}

	while (g1Start <= mid)				//비교하지 않은 왼쪽 배열이 있다면
		b[index++] = a[g1Start++];

	while (g2Start <= right)			//비교하지 않은 오른쪽 배열이 있다면
		b[index++] = a[g2Start++];

	while (--index >= 0)				//정렬된 b배열을 a에 복사
		a[left + index] = b[index];
}