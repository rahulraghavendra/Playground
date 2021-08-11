#include<iostream>
using namespace std;
int main()
{
 int total,bens,blacks,other;
  float ben,black;
  cin>>total>>ben>>black;
  bens=total*(ben/100);
  blacks=(total-bens)*(black/100);
  other=(total-(bens+blacks))/3;
  cout<<bens<<"\n";
  cout<<blacks<<"\n";
  cout<<other;
  //Type your code here.
}
                 