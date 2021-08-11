#include<iostream>
#include<string>
using namespace std;
int main()
{
  	string s;
  	cin>>s;
  	int ascii[26]={0},count=0;
  	for(int i=0;i<s.length();i++)
    	ascii[s[i]-'a']++;
 	for(int i=0;i<26;i++)
    {	
      	if(ascii[i]==1)
          count++;
    }
  	cout<<count;
    return 0;
}