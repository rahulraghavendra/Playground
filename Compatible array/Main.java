#include<iostream>
using namespace std;
int main()
{
  int n,m,a1[10],a2[10],flag=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a1[i];
  }
  cin>>m;
    for(int i=0;i<m;i++)
    {
      cin>>a2[i];
    }
  if(n==m)
  {
    for(int i=0;i<n;i++)
    {
      if(a1[i]>=a2[i])
      {
        flag=1;
      }
      else
        flag=0;
    }}
    else
      flag=0;
if(flag==1)
{
  cout<<"Compatible";
}
  else
    cout<<"Incompatible";
}