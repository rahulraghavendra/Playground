#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int age;
  float time,p;
  cin>>age;
  cin>>time;
  if(age>13&&time==13.30f)
  {
      p=5;
      
    }
    if(age>13&&time!=13.30f)
    {
      p=8;
     
    }
  
  if(age<13&&time==13.30f)
  {
      p=2;
      
    }
  if(age<13&&time!=13.30f)
    {
      p=4;
     
    }
  cout<<"$"<<fixed<<setprecision(2)<<p;
  }

    
      
