#include<iostream>
using namespace std;
int main()
{
  char s[100];
  cin>>s;
  int i;
  for(i=0;s[i]!='\0';i++);
  cout<<"The number of letters in the name is "<<i;
  //Type your code here.
}