#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    int i,j,k=1;
    char s[10];
  for(int i=0;i<10;i++)
    cin>>s;
    k=strlen(s);
    for(i=0;i<k;i++)
    {
        for(j=0;j<k;j++)
        {
         	if(i==j||k-j-1==i)
          cout<<s[j];
            else
     	cout<<" ";
        }
    		cout<<"\n";
    }
    return 0;
}