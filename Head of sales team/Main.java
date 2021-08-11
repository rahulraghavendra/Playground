#include<iostream>
using namespace std;
int main()
{
   int n, num,t, sum = 0, remainder;
   
   cin >> n;
   int arr[n];
   for(int i=0;i<n;i++)
   {
        cin >> arr[i];
   }

 for(int i=0;i<n;i++)
   {
        t = arr[i];
       while (t != 0)
   {
      remainder = t % 10;
      sum       = sum + remainder;
      t         = t / 10;
   }
  cout << sum << " ";
   sum=0;
   }
   return 0;
}
