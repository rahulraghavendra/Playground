#include <iostream>
using namespace std;
#include<string.h>
struct Student
{
    char name[30];
    char department[20];
    int yearOfStudy;
    float cgpa;
    };
void sortRecords(struct Student *s,int n)
{
    struct Student temp;
    int i,j;
    for(i=0;i<n;i++)    
    {
        for(j=0;j<n-i-1;j++)
        {
            if(strcmp(s[j].name,s[j+1].name)>0)
            {
                temp=s[j];
                s[j]=s[j+1];
                s[j+1]=temp;
            }
        }
    }
}
void dispStudentDetails(struct Student s)
{
    cout<<"Name : "<<s.name<<"\n";
    cout<<"Department : "<<s.department<<"\n";
    cout<<"Year of study : "<<s.yearOfStudy<<"\n";
    cout<<"CGPA : "<<s.cgpa<<"\n";
}
void dispStudentNamesFromYear(struct Student * s, int year, int n){
    cout<<"Students from Year "<<year<<"\n";
    int i;
    for(i=0;i<n;i++)
    {
        if(s[i].yearOfStudy==year)
        {
            cout<<s[i].name<<"\n";
        }
    }
}
void dispStudentNamesFromDept(struct Student * s, char * dept, int n){
    cout<<"Students from Department "<<dept<<"\n";
    int i;
    for(i=0;i<n;i++)
    {
        if(strcmp(s[i].department,dept)==0)
        {
            cout<<s[i].name<<"\n";
        }
    }
}
void dispDeptTopperDetails(struct Student * s, char * dept, int n){
    cout<<dept<<" Department Topper Details\n";
    float max=0.0f;
    int pos,i;
    for(i=0;i<n;i++)
    {
        if(strcmp(s[i].department,dept)==0)
        {
            if(max<s[i].cgpa)
            {
                pos=i;  
                max=s[i].cgpa;
            }
        }
    }
    dispStudentDetails(s[pos]);
}
void dispTopperDetails(struct Student * s, int n)
{
    cout<<"Overall Topper Details\n";
    float max=0.0f;
    int pos;
    int i;
    for(i=0;i<n;i++)
    {
        if(max<s[i].cgpa)
        {
            pos=i;
            max=s[i].cgpa;          
        }
    }
    dispStudentDetails(s[pos]);
}
void updateCGPA(struct Student * s)
{
    s->cgpa=s->cgpa+0.5;
}
void printMenu()
{
    cout<<"Menu\n1)Display names of students from a particular year\n";
    cout<<"2)Display names of students from a particular department\n";
    cout<<"3)Display all details of the student having the highest CGPA\n";
    cout<<"4)Display all details of the student from a particular department having the highest CGPA\n";
    cout<<"5)Display all details of a particular student (Search by name)\n";
    cout<<"6)Display all details of all students\n";
    cout<<"7)Update CGPA of a particular student\n";
    cout<<"8)Exit\n";
}
int main()
{
    int n,i,choice;
    struct Student c[100];
    cout<<"Enter the number of students\n";
    cin>>n;
    for(i=0;i<n;i++)
    {
        cout<<"Enter the details of student "<<i+1<<"\n";
        cout<<"Enter name\n";
        cin>>c[i].name;
        cout<<"Enter department\n";
        cin>>c[i].department;
        cout<<"Enter year of study\n";
        cin>>c[i].yearOfStudy;
        cout<<"Enter cgpa\n";
        cin>>c[i].cgpa;
    }
    int year;
    char dept[100];
    char nameSearch[100];
    int flag=0;
    sortRecords(c,n);
do {
        printMenu();
        flag=0;
        cout<<"Enter your choice\n";
        cin>>choice;
        switch(choice) {
        case 1:
            cout<<"Enter the year\n";
            cin>>year;
            dispStudentNamesFromYear(c,year,n);
            break;
        case 2:
            cout<<"Enter the department\n";
            cin>>dept;
            dispStudentNamesFromDept(c,dept,n);
            break;
        case 3:
            dispTopperDetails(c,n);
            break;
        case 4:
            cout<<"Enter the department\n";
            cin>>dept;
            dispDeptTopperDetails(c,dept,n);
            break;
        case 5:
            cout<<"Enter the name\n";
            cin>>nameSearch;
            for(i=0;i<n;i++)
            {
                if(strcmp(nameSearch,c[i].name)==0)
                {
                    flag=1;
                    dispStudentDetails(c[i]);
                    break;
                }
            }
            if(flag==0)
            cout<<"Student by name "<<nameSearch<<" not found"<<"\n";
            break;
        case 6:
        for(i=0;i<n;i++)
        {
            dispStudentDetails(c[i]);
        }
        break;
        case 7:
            cout<<"Enter the name\n";
            cin>>nameSearch;
            for(i=0;i<n;i++)
            {
                if(strcmp(c[i].name,nameSearch)==0)
                {
                    updateCGPA(&c[i]);
                    break;
                }
            }
            break;
        default:
            return 0;
        }
    }
    while(1);
    return 0;
}