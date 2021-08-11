#include<iostream>
using namespace std;
union employee
{
  char name[20];
  int salary;
};
int main()
{
 employee e;
 cout<<"Enter the Employee details\n";
  cout<<"Enter the Employee name :\n";
  cin>>e.name;
  cout<<"Enter the Employee salary :\n";
  cin>>e.salary;
  cout<<"Employee Details\n";
  cout<<e.name<<" "<<e.salary;
  //Type your code here.
}