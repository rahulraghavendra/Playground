#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int tb,tr,cr,cb;
cin>>tb>>tr>>cr>>cb;
float t6=tb/6;
int t=cb/6;
int p=cb%6;
float c6= ((float)t+ (float)p/10);
float crr=cr/c6;
float trr=tr/t6;
cout<<t6<<"\n"<<fixed<<setprecision(1)<<c6<<"\n"<<crr<<"\n"<<trr<<"\n";
if(crr>trr)
 cout<<"Eligible to Win"<<"\n";
else
 cout<<"Not Eligible to Win"<<"\n";
}
