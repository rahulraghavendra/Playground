#include<iostream>
using namespace std;
int main()
{
 int n1,n2,i,j,sum1=0,sum2=0;
  cin>>n1;
  cin>>n2;
  for(int i=1;i<n1;i++)
  {
    if((n1%i)==0)
      sum1=sum1+i;
  }
  for(int j=1;j<n2;j++)
  {
    if((n2%j)==0)
    {
      sum2=sum2+j;
    }
  }
  if(sum1/n1==sum2/n2)
  {
    cout<<"Friendly Pair";
  }
  else
    cout<<"Not Friendly Pair";
}
  
  //Type your code here.
