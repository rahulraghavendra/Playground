#include<iostream>
using namespace std;
int countdigits(int n)
{
  static int count=0;
  if(n>0)
  {
    count++;
    countdigits(n/10);
  }
  else
    return count;
}
  
int main()
{
  int num;
  cout<<"Enter the value of n\n";
  cin>>num;
  int digits;
  digits=countdigits(num);
  cout<<"The number of digits in "<<num<<" "<<"is "<<digits;
  //Type your code here.
}