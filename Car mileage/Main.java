#include<iostream>
using namespace std;
int main()
{
 float mileage,margin;
  int litre,dis;
  cin>>mileage;
  cin>>litre>>dis;
  margin=litre*mileage;
  if(dis<=margin)
  {
    cout<<"Can reach";
  }
  else
    cout<<"Cannot reach";
  //Type your code here.
}