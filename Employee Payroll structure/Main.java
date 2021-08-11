#include<iostream>
using namespace std;
struct employee
{
  char name[20];
  int id,bs,hra,da,ma,pf,ins;
  float gross,net;
};
int main()
{
  int n;int eid;
  cout<<"Enter the number of employees:\n";
  cin>>n;
 employee e[n];
 cout<<"Enter your input for every employee:\n";
  for(int i=0;i<n;i++)
  {
    cout<<"Employee ID:\n";
    cin>>e[i].id;
    cout<<"Employee Name:\n";
    cin>>e[i].name;
    cout<<"Basic Salary, HRA:\n";
    cin>>e[i].bs>>e[i].hra;
    cout<<"DA, Medical Allowance:\n";
    cin>>e[i].da>>e[i].ma;
    cout<<"PF and Insurance:\n";
    cin>>e[i].pf>>e[i].ins;
  }
  cout<<"Enter employee ID to get payslip:\n";
  cin>>eid;
  for(int i=0;i<n;i++)
  {
    if(eid==e[i].id)
    {
      cout<<"Salary Slip of "<<e[i].name<<"\n";
      cout<<"Employee ID: "<<e[i].id<<"\n";
      cout<<"Basic Salary: "<<e[i].bs<<"\n";
      cout<<"House Rent Allowance: "<<e[i].hra<<"\n";
      cout<<"Dearness Allowance: "<<e[i].da<<"\n";
       cout<<"Medical Allowance: "<<e[i].ma<<"\n";
      e[i].gross=e[i].bs*12+e[i].da*12+e[i].ma*12+e[i].hra*12;
      cout<<"Gross Salary: "<<e[i].gross<<" "<<"Rupees\n";
      cout<<"Deductions:\n";
      cout<<"Provident fund: "<<e[i].pf<<"\n";
      cout<<"Insurance: "<<e[i].ins<<"\n";
      e[i].net=e[i].gross-(e[i].pf*12+e[i].ins*12);
      cout<<"Net Salary: "<<e[i].net<<" "<<"Rupees";
    }}
  
  //Type your code here.
}