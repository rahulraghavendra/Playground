#include<iostream>
using namespace std;
int main()
{
 int m,n;
  cin>>m>>n;
  int mat1[m][n];
  int mat2[m][n];
  int sum[m][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>mat1[i][j];
    }
  }
   for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>mat2[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum[i][j]=mat1[i][j]+mat2[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
     cout<<sum[i][j]<<" ";
      
    }
    cout<<"\n";
  }
  //Type your code here.
}