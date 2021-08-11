#include<iostream>
using namespace std;
int main()
{
 int row,column,treeno;
  int count=0,loci=0,locj=0;
  cin>>row>>column>>treeno;
  int arr[row][column];
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<column;j++)
    {
      count++;
      if(count==treeno)
      {
        loci=i;
        locj=j;
      }
    }}
  int i=0,j=0;
    
    for(int j=0;j<column;j++)
    {
      if(i==loci&&j==locj)
      {
        cout<<"Yes";
        break;
      }
    }
    int flag=0;
    if(flag==0)
    {
      j=0;
      for(int i=0;i<row;i++)
      {
         if(i==loci&&j==locj)
      {
        cout<<"Yes";
        break;
      }
      }
      flag=1;
    }
    else if(flag==1)
    {
      j=column-1;
      for(i=0;i<row;i++)
      {
         if(i==loci&&j==locj)
      {
        cout<<"Yes";
        break;
      }
      }
    }
     if(loci!=0&&locj!=0)
      {
        cout<<"No";
      
      }
    
      
      //Type your code here.
}