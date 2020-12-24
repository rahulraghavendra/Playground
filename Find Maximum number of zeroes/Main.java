#include<iostream>
using namespace std;

int main()
{
   int n,i,j,count,row,count1=0; 
   cin>>n; 
   int a[n][n];
    for(i = 1; i <= n; i++)
    {
        count=0;
        for(j = 1; j <= n; j++)
        { 
           cin>>a[i][j]; 
           if(a[i][j]==1)
                continue;
           else 
               count++;   
        }       
        if(count > count1) 
         {    
           count1=count; 
           row=i;     
         }
    } 
   printf("Row = %d, count = %d",row,count1); 
   return 0;
}
