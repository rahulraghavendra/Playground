#include<iostream>
using namespace std;
int main()
{
 int n,sum;
  cin>>n;
  int temp=n;
  while(temp>0)
  {
    int rem=temp%10;
    sum=sum+rem;
    temp=temp/10;//Type your code here.
}
  if(n%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}