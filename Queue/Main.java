#include<iostream>
using namespace std;
int main()
{
  int n,m;
  
  int arr[100];
  cin>>n>>m;
  int i,a=0,ans=0;
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
   if(a+arr[i]>m)
                    {
                      ans++;
                      a=arr[i];
                    }
else
{a+=arr[i];
}}
if(a)
{
  ans++;
}
    cout<<ans<<endl;//Type your code here.
}

                  

                   
                   