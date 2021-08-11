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
   for(int j=0;j<c;j++)
  {
     sum+=a[0][j];
   }
  for(int i=1;i<=r-2;i++)
  {
    for(int j=c-2;j>0;j--)
    {
      sum+=a[i][j];
    }
  }
  for(int j=0;j<c;j++)
  {
    sum+=a[r-1][j];
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
  
  
  
  
  //Type your code here.
}