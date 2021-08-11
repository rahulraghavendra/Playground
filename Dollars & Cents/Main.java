#include<iostream>
using namespace std;
int main()
{
  int dollar1,cent1,dollar2,cent2;
  cin>>dollar1>>cent1>>dollar2>>cent2;
  int totaldollar=dollar1+dollar2;
  int totalcent=cent1+cent2;
  if (totalcent>100)
  {
    totaldollar+=1;
    totalcent-=100;//Type your code here.
}
  cout<<totaldollar<<"\n"<<totalcent;
}
  