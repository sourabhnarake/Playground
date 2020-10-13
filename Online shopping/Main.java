#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3,b1,b2,b3,c1,c2,c3;
  float x,y,z;
  cin>>a1;
  cin>>a2;
  cin>>a3;
  cin>>b1;
  cin>>b2;
  cin>>b3;
  cin>>c1;
  cin>>c2;
  cin>>c3;
  x=(a1-(a1*a2/100))+a3;
  y=(b1-(b1*b2/100))+b3;
  z=(c1-(c1*c2/100))+c3;
  cout<<"In Flipkart Rs."<<x<<"\n";
  cout<<"In Snapdeal Rs."<<y<<"\n";
  cout<<"In Amazon Rs."<<z<<"\n";
  if(x<=y&&x<=z)
    cout<<"He will prefer Flipkart";
  else if(y<=x&&y<=z)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}