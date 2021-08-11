#include<bits/stdc++.h>
using namespace std;
 
// function to find if number
// is special or not
void specialNumber(int a,int b)
{
    for(int i=a;i<=b;i++)
    {
        int first = i / 10;
         
        // Finding the last digit
        int last = i % 10;
         
        // Finding the sum of
        // the digits
        int sum = first + last;
         
        // Finding the product
        // of the digits
        int pro = first * last;
         
        if ((sum + pro) == i)
        {
         cout<<i<<endl;
        }
        
    }
}
 
// Driver Code
int main()
{int n1,n2;
    cin>>n1>>n2;
    // function calling
    specialNumber(n1,n2);
    return 0;
}