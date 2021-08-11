#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int n,p;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
     p=pow(i,2)-2;
      cout<<p<<" ";
    }
    else
    {
      p=pow(i,2)-1;
      cout<<p<<" ";
    }
  }}
    
    //Type your code here.
