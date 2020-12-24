#include<iostream>
using namespace std;
int main()
{
int i,j,l,count=0;                             

cin>>l;                               
for(int i=0;i<l;i++)                          
  {
    for(int j=0;j<l;j++)                      
     {
       count++;                              
       if(j==l-1)                             
         {
           printf("%d",count);                
         }
       else                                  
         {
           printf("%d*",count);              
         }
     }
   printf("\n");
  }
}