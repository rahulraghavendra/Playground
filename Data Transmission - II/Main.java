#include<iostream>
#include<string>
using namespace std;
int main()
{
    string str, rev;
    cin >> str;
    int i, j, count = 0;
    int len = str.size();
    
    for(i = 0, j = len-1; i < len; i++, j--)
    {
        if(str[i] == str[j])
            count++;
    }
    cout << count;
    return 0;
}