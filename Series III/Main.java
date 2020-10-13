#include<iostream>
using namespace std;
int main()
{
  int a,i,b=6;
  cin>>a;
  for(i=1;i<=a;i++)
  {
    cout<<b<<" ";
    b=b+(5*i);
  }
}