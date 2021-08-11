#include<iostream>
using namespace std;
int sum(int arr[], int start, int len)
{
  if(start>=len)
  {
    return 0;
  }
  else
    return (arr[start]+sum(arr,start+1,len));
}
int main()
{
  int arr[100];
  int n,sumofarray;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  sumofarray=sum(arr,0,n);
  cout<<sumofarray;
  //Type your code here.
}