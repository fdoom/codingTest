#include<iostream>
#include<algorithm>
using namespace std;

const char b[8][9] = {
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"}
};
const char w[8][9] = {
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"}
};

int black(int x, int y);
int white(int x, int y);
char board[50][50];

int main()
{
    int row, columns, result = 123456;
    cin >> row >> columns;

    for (int i = 0; i < row; i++)
        cin >> board[i];

    for (int i = 0; i < row - 7; i++)
    {
        for (int j = 0; j < columns - 7; j++)
        {
            result = min(result, min(white(i, j), black(i, j)));
        }
    }
    cout << result << endl;
    return 0;
}

int black(int x, int y)
{
    int cnt = 0;
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (board[x + i][y + j] != b[i][j])
                cnt++;
        }
    }
    return cnt;
}

int white(int x, int y)
{
    int cnt = 0;
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (board[x + i][y + j] != w[i][j])
                cnt++;
        }
    }
    return cnt;
}