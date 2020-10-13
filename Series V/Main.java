#include<iostream>
using namespace std;
int main()
{
  int a,i,b=11,c;
  cin>>a;
  for(i=0;i<a;i++)
  {
    c=b*b;
    cout<<c<<" ";
    b=b+4;
  }
}