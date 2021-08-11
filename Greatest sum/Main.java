#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  int sumr=0,temp=0,count=0,sumc=0;
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
   for(int i=0;i<r;i++)
  {
     
    for(int j=0;j<c;j++)
    {
      sumr=sumr+a[i][j];
    }
     cout<<sumr<<" ";
  
  if(sumr>temp)
  {
    temp=sumr;
    count++;
  }
     sumr=0;
   }
  cout<<"\nRow "<<count<<" has maximum sum"<<"\n";
  cout<<"Sum of columns is"<<" ";
  temp=0,count=0;
   for(int j=0;j<c;j++)
  {
     
    for(int i=0;i<r;i++)
    {
      sumc=sumc+a[i][j];
    }
     cout<<sumc<<" ";
  
  if(sumc>temp)
  {
    temp=sumc;
    count++;
  }
     sumc=0;
   }
  cout<<"\nColumn"<<" "<<count<<" "<<"has maximum sum";
  
  
}