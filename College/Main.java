#include<iostream>
using namespace std;
struct College 
{ char name[100]; char city[100]; int establishmentYear; float passPercentage; };
int main()
{
 int n,i,j;
  cout<<"Enter the number of colleges\n";
  cin>>n;
 
  struct College c[n];
  for(i=1;i<=n;i++)
  {
    cout<<"Enter the details of college "<<i<<"\n";
    cout<<"Enter name\n";
    cin>>c[i].name;
    cout<<"Enter city\n";
    cin>>c[i].city;
    cout<<"Enter year of establishment\n";
    cin>>c[i].establishmentYear;
    cout<<"Enter pass percentage\n";
    cin>>c[i].passPercentage;
  }
  cout<<"Details of colleges\n";
  for(int i=1;i<=n;i++)
  {
    cout<<"College:"<<i<<"\n";
    cout<<"Name:"<<c[i].name<<"\n";
    cout<<"City:"<<c[i].city<<"\n";
    cout<<"Year of establishment:"<<c[i].establishmentYear<<"\n";
    cout<<"Pass percentage:"<<c[i].passPercentage<<"\n";
  }
  //Type your code here.
}