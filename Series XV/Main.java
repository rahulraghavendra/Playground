#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n==1)
  {
  cout<<3<<" ";
  }
  if(n==2)
  {
    cout<<3<<" ";
  cout<<8<<" ";
  }
  int j=3;
  int h=8;
  int d=2;
  if(n>=3)
  {
  cout<<3<<" ";
  cout<<8<<" ";
    for(int i=3;i<=n;i++)
  {
   int f=j+h+d;
      j=h;
      h=f;
      cout<<f<<" ";
      d++;
    //Type your code here.
}}}
