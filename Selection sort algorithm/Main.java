#include <iostream>
using namespace std;

int main() 
{ 
    int data[100],n,temp,i,j; 
   cin>>n; 
    for(i=0;i<n;i++) 
    {
        cin>>data[i]; 
    } 
    for(i=1;i<n;i++) 
    { 
        temp = data[i];
        j=i-1; 
        while(temp<data[j] && j>=0) 
        { 
            data[j+1] = data[j]; 
            --j; 
        } 
        data[j+1]=temp; 
    } 
    
    for(i=0; i<n; i++) 
      cout<<data[i]<<" "; 
    return 0; 
}