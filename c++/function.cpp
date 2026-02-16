#include<iostream>
using namespace std;
int add(int a, int b)
{
    return a+b;

}
int sub(int a, int b)
{
    return a-b;

}
int mul(int a, int b)
{
    return a*b;

}
float div1(float a, float b)
{
    return a/b;

}

int main(){
    int result=add(10,20);
    int result1=sub(10,20);
     int result2=mul(10,20);
     float result3=div1(10.5f,20.5f);
    
    cout<<" the addition of two number is "<<result<<endl;
    cout<<" the sub of two number is "<<result1<<endl;
    cout<<" the mul of two number is "<<result2<<endl;
    cout<<" the div of two number is "<<result3<<endl;
    return 0;
}