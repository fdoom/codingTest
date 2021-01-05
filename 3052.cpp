#include <iostream>

using namespace std;

int main(void)
{
    int a, arr[42] = { 0, }, cnt = 0;

    for(int i = 0; i < 10; i++)
    {
        cin >> a;
        arr[a % 42] = 1;
    }

    for(int i = 0; i < 42; i++)
        if (arr[i])
            cnt++;
    
    cout << cnt;
    return 0;
}