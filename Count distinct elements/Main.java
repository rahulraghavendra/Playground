#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  sort(a,a+n);
  int count=0;
  for(int i=0;i<n;i++)
  {
    while(i<n-1 && a[i]==a[i+1])
    {
      i++;
    }
    count++;
  }
  cout<<"There are"<<" "<<count<<" "<<"distinct element in the array.";
  //Type your code here.
}