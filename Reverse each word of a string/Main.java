#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;
 
int main()
{
  	string str;
  	int i, j, len, startIndex, endIndex;
 
  	getline(cin,str);
  	
  	len = str.size();
  	endIndex = len - 1;
  	
  	for(i = len - 1; i >= 0; i--)
	{
		if(str[i] == ' ' || i == 0)
		{
			if(i == 0)
			{
				startIndex = 0;
			}
			else
			{
				startIndex = i + 1;
			}
			for(j = startIndex; j <= endIndex; j++)
			{
				cout<<str[j];
			}
			endIndex = i - 1;
			cout<<" ";				
		} 
	}
	
  	return 0;
}