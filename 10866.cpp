#include <iostream> 
#include <deque> 

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false); cin.tie(NULL);
    int t;
    deque<int> dq;
    cin >> t;

    while (t--)
    {
        string com;
        int n;
        cin >> com;
        if (com == "push_front") {
            cin >> n;
            dq.push_front(n);
        }
        else if (com == "push_back")
        {
            cin >> n;
            dq.push_back(n);
        }
        else if (com == "pop_front")
        {
            if (dq.empty()) cout << "-1" << "\n";
            else
            {
                cout << dq.front() << "\n";
                dq.pop_front();
            }
        }
        else if (com == "pop_back")
        {
            if (dq.empty()) cout << "-1" << "\n";
            else
            {
                cout << dq.back() << "\n";
                dq.pop_back();
            }
        }
        else if (com == "size")
            cout << dq.size() << "\n";
        else if (com == "empty")
        {
            if (dq.empty()) cout << "1" << "\n";
            else cout << 0 << "\n";
        }
        else if (com == "front")
        {
            if (dq.empty()) cout << "-1" << "\n";
            else cout << dq.front() << "\n";
        }
        else if (com == "back")
        {
            if (dq.empty()) cout << "-1" << "\n";
            else cout << dq.back() << "\n";
        }
    }
}