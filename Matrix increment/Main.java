#include<iostream>
using namespace std;

int main() 
{
	int r, c, n;
	cin>>r>>c>>n;
	int a[r][c];
	for(int i = 0; i < r; i++)
	{
	    for(int j = 0; j < c; j++)
	    {
	        a[i][j]=n++;
		 cout<<a[i][j]<<" ";
		 
	    }
	    	cout<<endl;
	}
    return 0;
}