#include<iostream>
using namespace std;
int main()
{
 int r,h,lh,n,k;
  float v;
  cin>>r;
  cin>>h;
  v=3.14*r*r*h;
  cin>>lh;
  cin>>n;
  k=lh*n;
  if(k>=v)
  {
    cout<<"The tank can be filled within "<<n<<" "<<"hours";
  }
  else
  {
    cout<<"The tank cannot be filled within "<<n<<" "<<"hours";
  } //Type your code here.
}