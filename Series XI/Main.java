#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  cout<<95<<" ";
  float r=20.5;
  float j=95;
  for(int i=2;i<=n;i++)
  {
       float y=r;
    float next=j+y;
    j=next;
    cout<<j<<" ";
    r=r+2;

  //Type your code here.
}}