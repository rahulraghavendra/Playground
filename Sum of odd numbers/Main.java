#include<iostream>
using namespace std;
int sumofodd(int arr[],int n)
{
 static int sum=0;
  int i;
  if(n>0)
  {
    int i=n-1;
    if(arr[i]%2==1)
    {
      
      sum+=arr[i];
    }
      sumofodd(arr,i);
    }
    return sum;
  }
int main()
{
 int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int odd;
  odd=sumofodd(arr,n);
  cout<<"The sum of the odd elements in the array is"<<" "<<odd;
  //Type your code here.
}