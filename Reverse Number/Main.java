#include<iostream>
#include<cmath>
using namespace std;
int main(){
int n,rev=0,rem;
cin>>n;
while(n!=0)
{
rem = n % 10;
rev = rev * 10 + rem;
n = n / 10;
}
cout<<rev<<endl;
return 0;
}
