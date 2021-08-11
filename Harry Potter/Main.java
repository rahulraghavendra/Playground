#include<iostream>
using namespace std;
int main()
{
  int num,lastdigit,first,sum;
  
  cin>>num;
  lastdigit=num%10;
  first=num/1000;
  sum=lastdigit+first;
  cout<<sum;
  //Type your code here.
}