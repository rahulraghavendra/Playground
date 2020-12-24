#include<iostream>
using namespace std;
int main() {
    int n,largest1 = 0, largest2 = 0, i, temp;
    cin >> n;
    
    for (i = 0; i < n; i++) {
        cin >> temp;
        if(temp >= largest1) {
            largest2 = largest1;
            largest1 = temp;
        } else if(temp > largest2) {
            largest2 = temp;
        }
    }
    cout << largest1+largest2;
    return 0;
}