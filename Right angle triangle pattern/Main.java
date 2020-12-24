#include <iostream>
using namespace std;
int main()
{
  int n, c, k;
  cin>>n;
 
  for (c = 1; c <= n; c++)
  {
    for(k = 1; k <= c; k++)
      cout<<"* ";
 
    cout<<"\n";
  }
 
  return 0;
}