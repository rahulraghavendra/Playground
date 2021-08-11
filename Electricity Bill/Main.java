#include<iostream>
using namespace std;
int main()
{
  int unit;
  float cost;
  cin>>unit;
  if(unit<=200)
  {
    cost=unit*0.5;
  }
  else if(unit<=400)
  {
    cost=(0.65*unit)+100;
  }
  else if(unit<=600)
  {
    cost=(0.80*unit)+200;
  }
  else if(unit>600)
  {
    cost=(1.25*unit)+425;
  }
  cout<<"Rs."<<int(cost);
    
  //Type your code here.
}