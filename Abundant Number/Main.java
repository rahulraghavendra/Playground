#include<iostream>
using namespace std;
int main()
{
 int n,i,sum;
  cin>>n;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
    {
      sum=sum+i;
    }
  }
  if(n<sum)
  {
    cout<<"Abundant Number";
  }
  else
  {
    cout<<"Not Abundant Number";
  }
//Type your code here.
}