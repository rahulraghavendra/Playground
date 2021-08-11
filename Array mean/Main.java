
#include<stdio.h>
#include<iostream>
using namespace std;
int  main( )
{
int  a[25], n, i ;
float mean = 0, sum = 0 ;
printf("Enter the number of elements in the array");
  cout<<"\n";
scanf("%d ",& n);
printf("Enter the elements in the array\n");
for (  i = 0; i < n ; i++)
{
scanf("%d ",& a[i]);
}
for (i = 0 ; i < n ; i++)
{
sum = sum + a[i] ;
mean = sum / n ;}
cout<<"The mean of the array is"<<" "<<int(mean);
return ( 0 ) ;
}