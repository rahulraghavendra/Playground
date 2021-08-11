#include<iostream>
using namespace std;
int findsum(string str)
{
  string temp="";
  int sum=0;
  for(char ch:str)
  {
    if(isdigit(ch))
    {
      temp+=ch;
    }
    else
    {
      sum+=atoi(temp.c_str());
      temp="";
    }
  }
  return sum+atoi(temp.c_str());
}
    
int main()
{
  string str;
  cin>>str;
  cout<<findsum(str);
  //Type your code here.
}