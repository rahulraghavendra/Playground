#include <bits/stdc++.h>
#define N 3
using namespace std;

bool check_lower_triangular_matrix(int mat[N][N])
{
	for (int i = 0; i < N; i++)
		for (int j = i + 2; j < N; j++)
			if (mat[i][j] != 0)
				return false;
	return true;
}

int main()
{
	int mat[N][N];
	int i, j;
	for(i = 0; i < N; i++)
		{
			for(j = 0; j < N; j++)
				cin >> mat[i][j];
		}
	
	if (check_lower_triangular_matrix(mat))
		cout <<"Lower Triangular Matrix";
	else
		cout << "Not a Lower Triangular Matrix";
	return 0;
}