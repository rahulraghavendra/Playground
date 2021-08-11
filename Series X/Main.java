#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int next;
  int j=2;
  int y=2;
  cout<<2<<" ";
  for(int i=2;i<=n;i++)
  {
    y=j;
    next=(j*y)-1;
    j=next;
    cout<<j<<" ";
    //Type your code here.
}}