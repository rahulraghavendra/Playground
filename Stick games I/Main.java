#include<iostream>
using namespace std;
int main()
{
  int n,m;
  int min;
  cin>>n>>m;
  if(n<m)
  {
    
    min=n;
  }
  else
    min=m;
  if(min%2==0)
  {
    cout<<"Jaime Lannister";
  }
  else
  {
    cout<<"Tyrion Lannister";
  }
  //Type your code here.
}