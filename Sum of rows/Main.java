#include<iostream>
using namespace std;
int main()
{
  int r,c,sum=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    sum=0;
    for(int j=0;j<c;j++)
    {
      sum+=a[i][j];
    }
    cout<<sum<<"\n";
  }
  //Type your code here.
}