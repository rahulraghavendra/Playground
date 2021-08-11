#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int v,t;
  cin>>t>>v;
  float WCF;
   WCF = 35.74 + 0.6215*t + (0.4275*t - 35.75) * pow(v,0.16);
  cout<<WCF;//Type your code here.
}