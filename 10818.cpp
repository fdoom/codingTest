#include <iostream>

using namespace std;

int main(void)
{
    int n, max, min, a;
    cin >> n;
    
    for(int i = 0; i < n; i++)
    {
        cin >> a;
        
        if(i == 0)
            max = a, min = a;
        
        if(max < a)
            max = a;
        
        if(min > a)
            min = a;
    }
    cout << min << " " << max;
    return 0;
}