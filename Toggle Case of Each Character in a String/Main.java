#include<iostream>
using namespace std;
int main()
{
	string s;
  cin>>s;
  for(int i=0;s[i];i++)
  {
    if(s[i]>='a'&&s[i]<='z')
    {
      s[i]=s[i]-32;
    }
    else
      s[i]=s[i]+32;
  }
  cout<<s;
  
    //Type your code here.
}