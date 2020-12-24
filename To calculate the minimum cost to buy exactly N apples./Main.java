#include <iostream>
#include<stdio.h>
using namespace std;

int main()  
{
	int n,m1,m2,p1,p2,count=0,cost=0,flag = 0;
	cin>>n>>m1>>p1>>m2>>p2;
	while(1)  
	{
		if(count == n)  
		{
			cout<<cost;
			break;
		}
		else if(count < n)  
		{
			count+=m1;
			cost+=p1;
		}
		
		else if(count > n)  
		{
			if(flag == 0)  
			{
				count-=2*m1;
				cost-=2*p1;
				flag = 1;
			}
			count+=m2;
			cost+=p2;
		}     
	}
	return 0;  
}