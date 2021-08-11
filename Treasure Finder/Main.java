#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,s,l,temp=0;
  cin>>n1>>n2>>n3;
  int a[3]={n1,n2,n3};
  for(int i=0;i<3;i++)
  {
    for(int j=i+1;j<3;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  cout<<"The treasure is in box which has number"<<" "<<a[1]<<endl;
  int gcf=1,flag=0, count;
        for(count=1; flag==0;count++)
        {
                if(n1%count==0&&n2%count==0&&n3%count==0)
                        gcf=count;
                if(count>n1&&count>n2&&count>n3)
                {
                        flag=1;
                }
        }
        
  cout<<"The code to open the box is "<<gcf;
  
}