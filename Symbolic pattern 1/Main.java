#include<iostream>
using namespace std;

int main()
{
    int i,j,k;
cin>>k;
    for(i=1;i<=k;i++)
    {
        for(j=1;j<=k;j++)
        {
           if( i==(k/2)+1 || j==(k/2 )+1)
            {
      cout<<"*";
            }
            else
            {
               cout<<" ";
            }
        }
    cout<<"\n";
    }
    return 0;
}