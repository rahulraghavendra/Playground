#include<iostream>
using namespace std;
int main()
{
  int m,a,d,r;
  float di,g;
  cin>>m>>a>>d;
  if(m==4||m==5||m==6||m==11||m==12)
  {
    r=a*d;
    di=0.2*r;
    g=r+di;
    cout<<g;//Type your code here.
}
  else if(m>=1&&m<=12)
  {
    r=a*d;
    cout<<r;
  }
  else
    cout<<"Invalid Input";
  
}