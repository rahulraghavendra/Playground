#include<iostream>
using namespace std;
int maximum(int arr[],int n)
{
  static int i=0,max=0;
  if(i<n)
  {
    if(arr[i]>max)
    {
      max=arr[i];
    }
    i++;
    maximum(arr,n);
  }
  return max;
}
int main()
{
  int n,max;
 cout<<"Enter the size of the array\n";
  cin>>n;
  int arr[n];
  cout<<"Enter "<<n<<" "<<"elements of an array\n";
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  max=maximum(arr,n);
  cout<<"Maximum element in the array is"<<" "<<max;


  //Type your code here.
}