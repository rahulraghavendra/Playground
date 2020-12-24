#include<iostream>
using namespace std;
int main()
{
    int n, i, health_1, health_2, count = 0;
    cin >> n;
    int arr[n];
    for(i = 0; i < n; i++)
        cin >> arr[i];
    cin >> health_1 >> health_2;
    for(i = 0; i < n; i++)
    {
        if((health_1 % arr[i] == 0) && (health_2 % arr[i] == 0))
        {
            count++;
        }
    }
    cout << count;
}