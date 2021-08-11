#include<iostream>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cout<<a[i][j]<<" ";
    }
    cout<<"\n";
  }
  cout<<"Transpose matrix is:"<<"\n";
  for(int j=0;j<n;j++)
  {
    for(int i=0;i<n;i++)
    {
      cout<<a[i][j]<<" ";
    }
    cout<<"\n";
  }
  //Type your code here.
}