#include<iostream>
using namespace std;
int main()
{
  int A,B,C,N;
  cin>>A>>B>>C>>N;
  if(A%N==0)
  {
    cout<<"Car 1 goes into road A";
  }
  else if(B%N==0)
    cout<<"Car 1 goes into road B";
  else if(C%N==0)
  {
    cout<<"Car 1 goes into road C";
  }
  else
    cout<<"No path exist";
  //Type your code here.
}