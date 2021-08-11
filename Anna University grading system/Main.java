#include<iostream>
using namespace std;
int main()
{
  int m;
  char g;
  cin>>m;
  if(m==100)
  {
    g='S';
    cout<<g;
  }
  else if(m>=90&&m<=99)
  {
    g='A';
    cout<<g;}
  else if(m>=80&&m<=89){
    g='B';
    cout<<g;}
  else if(m>=70&&m<=79){
    g='C';
    cout<<g;}
  else if(m>=60&&m<=69){
    g='D';
    cout<<g;}
  else if(m>=50&&m<=59){
    g='E';
    cout<<g;}
  else if(m<50){
    g='F';
    cout<<g;}
  else
    cout<<"Invalid Input";
  
  
  //Type your code here.
}