#include<iostream>
using namespace std;
int main()
{
 char ch;
  int lowercase,uppercase;
  cin>>ch;
  lowercase=(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u');
  uppercase=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
  if(lowercase||uppercase)
  {
    cout<<"Vowel";
  }
  else if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
  {
    cout<<"Consonant";
  }
  else
  {
    cout<<"Not an alphabet";
  }
  
    
}