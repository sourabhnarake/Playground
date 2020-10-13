#include<iostream>
using namespace std;
int main()
{
  int a,b,c,result;
  float w,x,y,z;
  cin>>a;
  cin>>b;
  cin>>c;
  w=((a*b*c)/100);
  x=w+a;
  y=w*0.02;
  z=x-y;
  cout<<("%.2f", w)<<"\n";
  cout<<("%.2f", x)<<"\n";
  cout<<("%.2f", y)<<"\n";
  cout<<("%.2f", z);
}