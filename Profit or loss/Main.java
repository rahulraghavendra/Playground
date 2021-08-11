#include<iostream>
using namespace std;
int main()
{
  int ob,os,cp,sp;
  cin>>ob>>os;
  cp=ob;
  sp=os*12;
  if(sp-cp>0)
  {
    double p;
    p=sp-cp;
    cout<<"Profit : Rs."<<p;
  }
  else if(sp-cp<0)
  {
    double l;
    l=cp-sp;
    cout<<"Loss : Rs."<<l;
  }
  else
    cout<<"No profit nor loss";
  //Type your code here.
}