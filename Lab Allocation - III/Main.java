#include<iostream>
using namespace std;
int main()
{
 int x,y,z,n,i=0;
  cin>>x;
  cin>>y;
  cin>>z;
  cin>>n;
  if(x>=n||y>=n||z>=n)
  {
    i=1;
  
  if((x>=n&&y>=n)||(x>=n&&z>=n)||(y>=n&&z>=n))
  {
    i=2;}
  
  if(x>=n&&y>=n&&z>=n)
  {
    i=3;
  }}
  else
    i=0;
  cout<<i;
}
  
      
    