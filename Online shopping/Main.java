#include<iostream>
using namespace std;
int main()
{
 float fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  float df,ds,da;
  df=(fd/100)*fa;
  ds=(sd/100)*sa;
  da=(ad/100)*aa;
  int tf,ts,ta;
  tf=(fa-df)+fs;
  ts=(sa-ds)+ss;
  ta=(aa-da)+as;
  cout<<"In Flipkart Rs."<<tf<<"\n";
  cout<<"In Snapdeal Rs."<<ts<<"\n";
  cout<<"In Amazon Rs."<<ta<<"\n";
  if((tf<=ts)&&(tf<=ta))
  {
    cout<<"He will prefer Flipkart";
  }
  else if((ts<=tf)&&(ts<=ta))
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
  //Type your code here.
}