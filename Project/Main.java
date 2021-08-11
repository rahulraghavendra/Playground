#include <iostream>
using namespace std;

int main()
{
	int n,i,count=0;
cin>>n;
	int c[n];
	for(i=0;i<n;i++)
	{
		cin>>c[i];
	}
	i=1;
	while(1)
	{
		if(i != n)
		{
			if(c[n-i]!=0)
			{
				count++;
				c[n-i]--;
				count++;
				c[0]--;
			}
			else
				i++;
		}
		else
			break;
	}
	cout<<count+1;
	return 0;
}