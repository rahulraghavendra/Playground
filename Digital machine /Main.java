#include<bits/stdc++.h>
using namespace std;

int main()
{
	int size;
	cin>>size;
	char arr[size+1];
	int max=0,count=0;
	int flag=0;
	for(int i=0;i<size;i++)
	{
		cin>>arr[i];
	}
	for(int i=0;i<size;i++)
	{
		if(arr[i]=='1')
		{
			count++;
			flag=1;
		}

		else if(arr[i]=='0' && flag==1)
		{
			count=0;
			flag=0;
		}
		if(count>max)
		{
			max=count;
		}
	}
	cout<<max;
	return 0;
}