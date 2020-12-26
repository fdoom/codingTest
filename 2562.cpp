#include <iostream>

using namespace std;

int main(void)
{
    int arr[9];
    int max, index;

    for (int i = 0; i < 9; i++)
    {
        cin >> arr[i];

        if (!i)
        {
            max = arr[i];
            index = i;
        }

        if (max < arr[i])
        {
            max = arr[i];
            index = i;
        }
    }
    cout << max << endl <<index + 1;
}