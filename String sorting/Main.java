#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[100];
  cin>>str;
  char temp;
  int i,j;
  int n=strlen(str);
  for(i=0;i<n-1;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(str[i]>str[j])
      {
        temp=str[i];
        str[i]=str[j];
        str[j]=temp;
      }
    }
  }
  cout<<"The sorted string is "<<str;
  //Type your code here.
}