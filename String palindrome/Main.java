#include<iostream>
using namespace std;
int main()
{
 char a[20];
  cin>>a;
  int i,len,j,flag=0;
  for(len=0;a[len]!='\0';len++);
  for(i=0,j=len-1;i<len;++i,--j)
  {
    if(a[j]==a[i])
    {
     flag=1;
    }
    else
      flag=0;
  }
  if(flag==1)
  {
    cout<<"Palindrome";
  }
  else
    cout<<"Not a Palindrome";//Type your code here.
}