#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int tb,tr,cr,cb;
  cin>>tb;
  cin>>tr;
    cin>>cr;
    cin>>cb;
  float to=tb/6;
  float co;
  co=cb/6;
  float temp=co;
  float p=cb%6;
  float oversfinished=co+p/10;
  float crr=cr/oversfinished;
  float trr=tr/to;
  cout<<to<<"\n"<<fixed<<setprecision(1)<<oversfinished<<"\n"<<crr<<"\n"<<trr;
  if(crr>trr)
  {
    cout<<"\nEligible to Win";
  }
  else
    cout<<"\nNot Eligible to Win";
  
  //Type your code here.
}