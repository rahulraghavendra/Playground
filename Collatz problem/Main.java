#include<iostream>
using namespace std;
int main()
{
 int n;
   
   cin>>n;
  cout<<n<<"\n";
  int count=0;
  while(n!=1)
  {
    count++;
    if(n%2==0)
    {
      n=n/2;
      cout<<n<<endl;
    }
    else
    {
      n=3*n+1;
      cout<<n<<endl;
    }
  }
  cout<<count;
  
  
}