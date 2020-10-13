#include<iostream>
using namespace std;
int main()
{
  float a1,a2,a3;
  cin>>a1;
  cin>>a2;
  if(a1==1)
    cout<<a2+float(0.00);
  else if(a1==2)
  {
    a3=a2+(a2*0.5);
    printf("%.2f", a3);
  }
  else if(a1==3)
  {
    a3=2*a2;
    printf("%.2f", a3);
  }
  else if(a1>3)
    cout<<"Number of items is more";
}