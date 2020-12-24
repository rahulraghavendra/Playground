#include<iostream>
using namespace std;
int main()
{
int x,b,c,i,t,s1;

cin>>x>>b>>c;

if(x>b && x>c)

{

if(b>c){s1=b;}

else{s1=c;}

}

else if(b>x && b>c){

if(x>c){s1=x;}

else{s1=c;}}

else 
{if(x>b){s1=x;}

else{s1=b;}

}

std::cout<<"The treasure is in box which has number "<<s1<<"\n";

for(i=1;i<=5;i++){

if(x%i==0 && b%i==0 && c%i==0){

t=i;

}

}

std::cout<<"The code to open the box is "<<t;


 //Type your code here.
}