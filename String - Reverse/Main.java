#include<iostream>
using namespace std;
int main()
{
 char s[100];
  char r[100];
  int begin,end,count=0;
  gets(s);
  while(s[count]!='\0')
  {
    count++;
  }
  end=count-1;
  for(begin=0;begin<count;begin++)
  {
    r[begin]=s[end];
    end--;
  }
  r[begin]='\0';
  cout<<"The reversed String is "<<r<<".";
  
  //Type your code here.
}