#include<iostream>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3;
  float a,b,c,d;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  a=(x2+x1)/2;
  b=(y2+y1)/2;
  c=(((2*a)+(1*x3))/3);
  d=(((2*b)+(1*y3))/3);
  cout<<c<<"\n";
  cout<<d;
}