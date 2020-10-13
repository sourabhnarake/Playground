#include <iostream>
using namespace std; 
int main()
{
  float a,b,c,d;
  cin>>a;
  cin>>b;
  cin>>c;
  d=c/b;
  if(d<=a)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}