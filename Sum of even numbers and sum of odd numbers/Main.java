#include <stdio.h>
#include<iostream>
#include <stdlib.h>
using namespace std;
int main()
{
    int arr[15];
  int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
    int i,oddSum=0,evenSum=0;
    for(i=0; i<n; i++){
        if(arr[i]%2==0){
        evenSum=evenSum+arr[i];
        }
    else{
             oddSum=oddSum+arr[i];
        }
    }
  cout<<"The sum of the even numbers in the array is"<<" "<<evenSum;
  cout<<"\n";
    printf("The sum of the odd numbers in the array is %d",oddSum);
    
    
    return 0;
}