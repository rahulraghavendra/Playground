#include<iostream>
using namespace std;
union book
{
  char name[20];
  int price;
  char name2[20];
};
int main()
{
  book j;
  cout<<"Enter the Book details\n";
  cout<<"Enter the Book name\n";
  cin>>j.name;
  cout<<"Enter the Book price\n";
  cin>>j.price;
  cout<<"Book Details\n";
  cout<<j.name<<" "<<j.price<<"\n";
  cout<<"Enter the Book name\n";
  cin>>j.name2;
  cout<<"Book Name :"<<" "<<j.name2;
  return 0;
}
