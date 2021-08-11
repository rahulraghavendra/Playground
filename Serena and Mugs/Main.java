#include<iostream>
using namespace std;
int main()
{
 int n,c,sum=0;
  cin>>n;
  cin>>c;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=c)
  {
    cout<<"YES";
  }
  else
    cout<<"NO";
  //Type your code here.
}