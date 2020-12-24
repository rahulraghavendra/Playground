#include<iostream>
using namespace std;

void fun(int arr[], int n) 
{ 
    int temp[n], i; 
    for (i = 0; i < n; i++) 
        temp[arr[i]] = i; 
    for (i = 0; i < n; i++) 
        arr[i] = temp[i]; 
} 
int main(){
    int i,n;
    cin>>n;
    int arr[n];
    for(i=0;i<n;i++)
        cin>>arr[i];
   int m = sizeof(arr) / sizeof(arr[0]); 
   fun(arr, m);
    for (i = 0; i < n; i++) 
        cout<<arr[i]<<" "; 
    cout<<endl;
    return 0; 
}
