#include<stdio.h>

int main()
{
int i , j, r , c , n , a[100][100],max[100];
scanf("%d",&r);
scanf("%d",&c);
for(i = 0; i < r; i=i+1)
{
for(j = 0; j < c; j=j+1)
{

scanf("%d",&a[i][j]);
}
}


for(i = 0; i < r; i++)
{
max[i] = a[i][j];
for(j = 0; j < c ; j++)
{
if(a[i][j]>max[i])
{
max[i]=a[i][j];
}
}

}
for(i = 0; i < r; i++)
{
printf("%d\n",max[i]);
}
return 0;
}