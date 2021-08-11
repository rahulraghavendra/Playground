#include<iostream>
using namespace std;
int prime(int n,int i)
{
  if(i==1)
  {
    return 1;
  }
  else
  {
    if(n%i==0)
    {
      return 0;
    }
    else
    {
      return prime(n,i-1);
    }
  }
}

int main()
{
  int n,check;
  cin>>n;
  check=prime(n,n-1);
  if(check==1)
  {
    cout<<"Prime Number";
  }
  else
  {
    cout<<"Not a Prime Number";
  }
  
  //Type your code here.
}