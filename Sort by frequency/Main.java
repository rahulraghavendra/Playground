#include<iostream>
using namespace std;

void swap(int* a,int* b)
{
    int c;
    c=*a;
    *a=*b;
    *b=c;
}
int main()
{
    int n,i,j=0,count=0,k;
    cin>>n;
    int a[n],freq[n][2];
    for(i=0;i<n;i++)
        cin>>a[i];
    for(i=0;i<n;i++)
    {
        if(a[i]==a[i+1])
            { 
               count++;
            }
        
         else
        {
            count++;
            freq[j][0]=a[i];
            freq[j][1]=count;
            j++;
            count=0;
        }
    }
    for(k=0;k<j-1;k++)
        {
            for(i=0;i<j-k-1;i++)
            {
                if(freq[i][1]<freq[i+1][1])
                {
                    swap(&freq[i+1][0],&freq[i][0]);
                    swap(&freq[i+1][1],&freq[i][1]);
                }
            }
        }
        
    for(k=0;k<j;k++)
     {
         for(i=0;i<freq[k][1];i++)
            cout<<freq[k][0]<<" ";
     }
}
