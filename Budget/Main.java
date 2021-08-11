#include<iostream>
using namespace std;
int main()
{
  float r,v,a,ar,l,pr,pv,pa,par,pl,t;
  cin>>r>>v>>a>>ar>>l;
  pr=r*350.34;
  pv=v*230.90;
  pa=a*190.55;
  par=ar*125.30;
  pl=l*180.90;
  t=pr+pv+pa+par+pl;
  if(t<=15000)
  {
    cout<<"Yes";
  }
  else
    cout<<"No";
  //Type your code here.
}