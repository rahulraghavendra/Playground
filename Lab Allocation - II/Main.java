#include<stdio.h>
#include<string.h>
int main()
{
    int x,y,z;
    char lab[2];
    scanf("%d", &x);
    scanf("%d", &y);
    scanf("%d", &z);
    scanf("%s",lab);
    if(strcmp(lab, "L1")==0)
    {
        if(y<z)
         printf("L2");
         else
         printf("L3"); 
    }
    else if(strcmp(lab, "L2")==0) 
    {
        if(x<z)
         printf("L1");
         else
         printf("L3"); 
    }
    else
    {
        if(x<y)
         printf("L1");
         else
         printf("L2");    
    }
    return 0;
}