#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  double x,y,r;
  cin>>x>>y>>r;
  double inter;
  inter=(x*y*r)/100;
  double amount;
  amount=inter+x;
  double disc;
  disc=inter*2/100;
  double finalamount;
  finalamount=amount-disc;
  cout<<fixed<<setprecision(2)<<inter<<endl;
  cout<<fixed<<setprecision(2)<<amount<<endl;
  cout<<fixed<<setprecision(2)<<disc<<endl;
  cout<<fixed<<setprecision(2)<<finalamount;
  
  //Type your code here.
}