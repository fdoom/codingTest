#include <iostream>

using namespace std;

int main(void)
{
    int a, b, c, mul;
    int arr[10] = {0, };

    cin >> a >> b >> c;
    mul = a * b * c;

    while (mul != 0)   
    {
        int remain = mul % 10;
        for (int i = 0; i < 10; i++)
        {
            if (i == remain)
                arr[i]++;
        }
        mul /= 10;
    }

    for (int i = 0; i < 10; i++)
        cout << arr[i] << endl;

    return 0;
}