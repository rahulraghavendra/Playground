#include<iostream>
using namespace std;
int main()
{
  int i,len,j,flag=0;
  char s[100];
  cin>>s;
  char s1[100];
  cin>>s1;
  for(len=0;s[len]!='\0';len++);
  for(i=0,j=len-1;i<len/2;++i,--j)
  {
    if(s1[i]==s[j])
    {
      flag=1;
    }
    else
      flag=0;
  }
  if(flag==1)
  {
    cout<<"It is correct";
  }
  else
    cout<<"It is wrong";

  //Type your code here.
}