#include<iostream>
using namespace std;
#include<stdlib.h>
#include <string.h> 

char str[100], sub[100];
int count = 0, count1 = 0;
int main()
{
    int i, j, l, l1, l2;
    scanf("%[^\n]s", str);
    l1 = strlen(str);
    fflush(stdin);
    scanf("%s", sub);
    l2 = strlen(sub);
    for (i = 0; i < l1;)
    {
        j = 0,count = 0;
        while ((str[i] == sub[j]))
        {
            count++;
            i++;
            j++;
        }
       if (count == l2)
	    {
            count1++;                                   
        }
        else
            i++;
    }    
   cout<<"Occurrences = "<< count1;
    return 0;
}


