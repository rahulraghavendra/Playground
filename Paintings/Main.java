#include<iostream>
using namespace std;
int main()
{
  int l1,b1,l2,b2,l3,b3;
  cin>>l1>>b1>>l2>>b2>>l3>>b3;
  int a1,a2,a3;
  a1=l1*b1;
  a2=l2*b2;
  a3=l3*b3;
  if(a2+a3<=a1)
  {
    cout<<"Leonardo can fix both painting";
  }
  else
  {
    cout<<"Leonardo cannot fix both painting";
  }//Type your code here.
}