#include<iostream>
using namespace std;
long fact(int n)
{
  if(n==0)
  {
    return 1;
  }
  else
    return n*fact(n-1);
}
int main()
{
  int n;
  cin>>n;
  int fac;
  fac=fact(n);
  cout<<"The factorial of"<<" "<<n<<" "<<"is"<<" "<<fac;
  //Type your code here.
}