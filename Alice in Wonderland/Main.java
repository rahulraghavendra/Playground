#include<iostream>
using namespace std;
int main()
{
  int n,r,sum=0;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
    
  }
  cout<<"Alice must go in path-"<<sum;
  //Type your code here.
}