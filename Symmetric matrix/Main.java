#include<iostream>
using namespace std;
int main ()
{
    int A[10][10], i, j, m, n, x = 0, y = 0;
    
    cin >> m >> n;
    
    for (i = 0; i < m; i++)
        for (j = 0; j < n; j++)
            cin >> A[i][j];
    for (i = 0; i < m; i++)
    {
        for( j = 0; j < n; j++)
        {
            if (A[i][j] != A[j][i])
                x = 1;
            else if (A[i][j] == -A[j][i])
                    y = 1;
        }
    }
    if (x == 0)
        cout << "Symmetric";
    else if (y == 1)
        cout << "Symmetric";
    else
        cout << "Not Symmetric";
   
    return 0;
}