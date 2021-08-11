#include <stdio.h>
 
void swap(int*, int*);
 
int main()
{
   int x, y;
 
   
   scanf("%d%d",&x,&y);
 
   printf("Before swapping a= %d and b=%d\n", x, y);
 
   swap(&x, &y); 
 
   printf("After swapping a= %d and b=%d", x, y);
 
   return 0;
}
 
void swap(int *a, int *b)
{
   int temp;
 
   temp = *b;
   *b = *a;
   *a = temp;   
}
 