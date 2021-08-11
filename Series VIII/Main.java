#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,e=5,a;
  cin>>n;

  for(int i=0;i<n;i++)
  {
    if(i==0)
    {
       cout<<4<<" ";
      continue;
    }
    if(i==1)
    {
      cout<<5<<" ";
      continue;
    }
    
    int d;
    d=pow(i,2);
    a=e+d;
    cout<<a<<" ";
    e=a;
  }
    
  //Type your code here.
}