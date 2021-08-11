#include<iostream>
using namespace std;
int main()
{
 int a=1,b=2,n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i==1)
    {
      cout<<a<<" ";
      continue;
    }
    else if(i==2)
    {
      cout<<b<<" ";
    }
    else
    {
      if(i%2==1)
      {
        a=a*3;
        cout<<a<<" ";
      }
      else
      {
        b=b*3;
        cout<<b<<" ";
      }
    }
    //Type your code here.
}}