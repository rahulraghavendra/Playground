#include<iostream>
using namespace std;

int main()
{
    int n,i,j,temp;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
        cin>>a[i];
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
   for(i=0;i<n;i+=2)
        cout<<a[i]<<" ";
    }
 
