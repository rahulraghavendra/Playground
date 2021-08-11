#include<iostream>
using namespace std;
int g(int n1, int n2)
{
  while(n1!=n2)
  {
    if(n1>n2)
    {
      return g(n1-n2,n2);
    }
    else
    {
      return g(n1,n2-n1);
    }
  }
}
int main()
{
 int n1,n2;
  cin>>n1>>n2;
  int gcd=g(n1,n2);
  cout<<"G.C.D of "<<n1<<" "<<"and "<<n2<<" "<<"= "<<gcd;//Type your code here.
}