#include<iostream>
using namespace std;
int main()
{
	int n,m,i,j;
	cin >> n >> m;
	int a[n][m];
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++)
			cin >> a[i][j];
	}
	int max;
	for(i=0;i<n;i++) {
		max = 0;
		for(j=0;j<m;j++)
		{
			if(max<a[i][j])
				max = a[i][j];
		}
		cout << max << " ";
	}
	return 0;
}