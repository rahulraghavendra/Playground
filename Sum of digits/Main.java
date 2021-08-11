#include<iostream>
using namespace std;
int sum(int n)
{
  if(n==0)
  {
    return 0;
  }
  else
  {
    return (n%10+sum(n/10));
  }
}

int main()
{
 int n;
  cout<<"Enter the value of n\n";
  cin>>n;
  int result;
  result=sum(n);
  cout<<"The sum of digits in "<<n<<" "<<"is "<<result;
  //Type your code here.
}