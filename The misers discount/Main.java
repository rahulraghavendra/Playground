#include<iostream>
using namespace std;
int main()
{
  float item1,item2,d,disamount,saved,total;
  cin>>item1>>item2>>d;
  total=item1+item2;
  disamount=(item1+item2)*d/100;
  saved=item1+item2-disamount;
  cout<<total<<"\n"<<saved<<"\n"<<disamount;
  //Type your code here.
}