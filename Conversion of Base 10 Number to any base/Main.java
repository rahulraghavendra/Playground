#include<iostream>
using namespace std;
void converttob(int n,int b)
{
  if(n==0)
  {
    return;
  }
  int x=n%b;
  n/=b;
  if(x<0)
  {
    n+=1;
  }
  converttob(n,b);
  cout<<x<0?x+(b*-1):x;
  return;
}
  
int main()
{
  int n,b;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"Enter the base to which you want to convert\n";
  cin>>b;
  
  if(n!=0)
  {
    
  cout<<"The number in base "<<b<<" "<<"is ";
    converttob(n,b);
    cout<<"\n";
  }
  else
    cout<<"0"<<endl;
  //Type your code here.
}