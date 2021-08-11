#include<iostream>
using namespace std;
int main()
{
  string s1;
  cin>>s1;
  int wordakshari,i;
  string s2;
  s2=s1;
  cout<<s1<<endl;
  while(1)
  {
    cin>>s1;
    i=0;
    if(s1=="####")
    {
      break;
    }
    wordakshari=0;
    while(s2[i++]!='\0');
    i--;
    if(s2[i-1]==s1[0])
    {
      cout<<s1<<endl;
      wordakshari=1;
    }
    if(wordakshari==1)
    {
      s2=s1;
    }
  }

}