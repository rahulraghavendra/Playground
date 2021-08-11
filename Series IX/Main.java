#include "bits/stdc++.h"
using namespace std;
 
// Function to print the series
void printSeries(int N)
{
 
    int ith_term = 0;
 
    // Generate the ith term and
    for (int i = 1; i <= N; i++) {
 
        ith_term = (13 * i * (i - 1)) / 2 + 2;
        cout << ith_term <<" ";
    }
}
 
// Driver Code
int main()
{
    int N;
  cin>>N;
 
    printSeries(N);
    return 0;
}