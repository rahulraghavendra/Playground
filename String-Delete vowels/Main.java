#include<iostream>
using namespace std;
int vowels(char t)
{
  if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U')
  {
    return 1;
  }
  return 0;
}
int main()
{
 char s[100],t[100];
  int c,d=0;
  gets(s);
  for(c=0;s[c]!='\0';c++)
  {
    if(vowels(s[c])==0)
    {
      t[d]=s[c];
      d++;
    }
  }
  t[d]='\0';
  cout<<t;
  
      //Type your code here.
}