#include<iostream>
using namespace std;
int main()
{
 int l,litre,vol;
  cin>>l>>litre;
  vol=l*l*l*1000;
  if(litre<=vol)
  {
    cout<<"Can store";
  }
  else
    cout<<"Cannot store";
  //Type your code here.
}