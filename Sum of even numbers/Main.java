#include<stdio.h>
int main()
{
int Size, i, a[10];
int Even_Sum = 0, Odd_Sum = 0;
printf("Enter the number of elements in the array\n");
scanf("%d", &Size);
printf("Enter the elements in the array\n");
for(i = 0; i < Size; i++)
{
      scanf("%d", &a[i]);
}
for(i = 0; i < Size; i ++)
{
   if(a[i] % 2 == 0)
   {
Even_Sum = Even_Sum + a[i];
   }}
printf("The sum of the even elements in the array is %d ", Even_Sum);
}

