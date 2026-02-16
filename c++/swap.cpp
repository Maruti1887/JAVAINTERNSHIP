#include<iostream>
using namespace std;
int main(){
    int a;
    int b;
    int temp;
  
    cout<<" enter the a is "<<endl;
    cin>>a;

    cout<<" the b is "<<endl;
    cin>>b;

    temp=a;
    a=b;
    b=temp;

    cout<<" the values after the sapping is ";
    cout<<" the value of a is"<<a<<endl;
    cout<<" the value of b is "<<b<<endl;

    return 0;
}