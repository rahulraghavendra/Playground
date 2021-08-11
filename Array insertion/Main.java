#include <stdio.h>
#include<iostream>
using namespace std;
int main()
{
    int arr[100];
    int i, x, pos,n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  
 for(int i=0;i<n;i++)
 {
   cin>>arr[i];
 }
    
    cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>pos;
  if(pos>n)
  {
    cout<<"Invalid Input";
    exit(0);
  }
  cout<<"Enter the value to insert"<<endl;
  cin>>x;
 
  n++;
    // shift elements forward
    for (i = n-1; i >= pos; i--)
    
        arr[i] = arr[i - 1];
    // insert x at pos
    arr[pos - 1] = x;
    
 cout<<"Array after insertion is"<<endl;
    // print the updated array
    for (i = 0; i < n; i++)
    {
        cout<<arr[i]<<"\n";
      
    }
  
    return 0;
}