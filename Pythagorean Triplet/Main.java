#include<iostream>
using namespace std;

int main()
{
   int i,j,k,n;
   cin>>n;
   for(i=1;i<=n;i++)
   {
       for(j=i+1;j<=n;j++)
       {
           for(k=j+1;k<=n;k++)
            {
                if((i*i+j*j)==(k*k))
                    printf("%d\t%d\t%d\n",i,j,k);
            }
       }
   }
}
