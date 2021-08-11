#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n==1)
  {
  cout<<9<<" ";
  }
  if(n==2)
  {
    cout<<9<<" ";
  cout<<11<<" ";
  }
  int j=9;
  int h=11;
  if(n>=3)
  {
  cout<<9<<" ";
  cout<<11<<" ";
    for(int i=3;i<=n;i++)
  {
   int f=j+h;
      j=h;
      h=f;
      cout<<f<<" ";
    //Type your code here.
}}}