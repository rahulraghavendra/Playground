#include<iostream>

using namespace std;

int main()

{

int size,loc,value;

cout<<"Enter the number of elements in the array";

cin>>size;

int arr[size],i;

cout<<"\nEnter the elements in the array";

for(i=0;i<size;i++)

cin>>arr[i];

cout<<"\nEnter the location where you wish to insert an element";

cin>>loc;

if(loc>5)

cout<<"\nInvalid Input";

else

{

cout<<"\nEnter the value to insert";

cin>>value;

cout<<"\nArray after insertion is";

for(i=0;i<loc-1;i++)

{

cout<<"\n"<<arr[i];

}

cout<<"\n"<<value;

for(i=loc-1;i<size;i++)

{

cout<<"\n"<<arr[i];

}

}

}

