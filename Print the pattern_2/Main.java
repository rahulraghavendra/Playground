#include<iostream>
using namespace std;

int main()
{
    int n;
    
    cin>>n;
    int p=n;
    
    for(int i=1;i<=n;i+=2)
    {
        int k=(i-1)*n+1;
        for(int j=0;j<n-1;j++)
        {
            printf("%d * ",k);
            k++;
        }
        printf("%d \n",k);
    }
    if(n%2!=0)
    {
        p=n-1;
    }
    for(int i=p;i>0;i-=2)
    {
        int k=(i-1)*n+1;
        for(int j=0;j<n-1;j++)
        {
            printf("%d * ",k);
            k++;
        }
        printf("%d \n",k);
    }
    
    return 0;
}
