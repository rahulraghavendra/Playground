#include<iostream>
using namespace std;
int main()
{
 int i,j,n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
      {
        for(int k=j;k<n-1;k++)
        {
          a[k]=a[k+1];
        }
          n--;
        }
      
  
    
  }}
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<"\n";
  }
  
      
          
          //Type your code here.
}