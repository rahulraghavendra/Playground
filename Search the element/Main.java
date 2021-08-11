#include<iostream>
using namespace std;
int search(int array[],int key,int size)
{
  if(size<0)
  {
    return -1;
  }
  else if(array[size]==key)
  {
    return 1;
  }
  else
    return search(array,key,size-1);
}
int main()
{
 int size;
  cin>>size;
  int array[size],key;
  for(int i=0;i<size;i++)
  {
    cin>>array[i];
  }
  cin>>key;
  int result;
  result=search(array,key,size);
  if(result==1)
  {
    cout<<key;
  }
  else 
  {
    cout<<"The number is not present in the list";
  }
}//Type your code here.
