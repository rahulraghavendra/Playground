#include<iostream>
using namespace std;
int main()
{
  float score;
  int count,n;
 do
 {
   cin>>n;
   if(n<0)
   {
     score-=1;
     break;
   }
   else if(n%2==0)
   {
     score-=0.5;
   }
   else
   {
     score+=1;
     count++;
   }
 }while(count!=3);
  cout<<score;
   
   //Type your code here.
}