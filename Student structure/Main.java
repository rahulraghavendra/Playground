#include<iostream>
using namespace std;
struct student
{
  int rollno;
  int s1,s2,s3,s4,s5;
  int total;
  int avg;
  int grade;
}stud[1];
int main()
{
  int a,b,n;
  stud[a].total=0;
  stud[a].avg=0;
  cout<<"STUDENT MARKSHEET USING STRUCTURES\n";
  cout<<"Enter the no of students\n";
  cin>>n;
  cout<<"rn s1 s2 s3 s4 s5 avg grade\n";
  for(a=0;a<n;a++)
  {
    cin>>stud[a].rollno;
    cout<<stud[a].rollno<<" ";
    cin>>stud[a].s1;
    cout<<stud[a].s1<<" ";
    cin>>stud[a].s2;
    cout<<stud[a].s2<<" ";cin>>stud[a].s3;
    cout<<stud[a].s3<<" ";cin>>stud[a].s4;
    cout<<stud[a].s4<<" ";cin>>stud[a].s5;
    cout<<stud[a].s5<<" ";
    stud[a].total+=stud[a].s1+stud[a].s2+stud[a].s3+stud[a].s4+stud[a].s5;
    stud[a].avg=(stud[a].total)/5;
    cout<<stud[a].avg<<" ";
    stud[a].total=0;
    if(stud[a].avg>70)
    {
      stud[a].grade=1;
      cout<<stud[a].grade;
    }
    else if(stud[a].avg>50&&stud[a].avg<70)
    {
      stud[a].grade=2;
      cout<<stud[a].grade;
    }
      else 
    {
      stud[a].grade=3;
      cout<<stud[a].grade;
    }
    cout<<"\n";
    stud[a].avg=0;
  }
  //Type your code here.
}