#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int count=0;
  int temp;
 
  int b;
  b=(n%100)/10;//Type your code here.

if(b%3==0&&n>99)
{
  cout<<"Trendy Number";
}
  if(b%3!=0&&n>99)
{
  cout<<"Not a Trendy Number";
}
if(n<100)
  cout<<"Invalid Number";
}