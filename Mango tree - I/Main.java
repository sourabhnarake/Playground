#include<iostream>
using namespace std;
int main()
{
  int a1,a2,x;
  cin>>a1;
  cin>>a2;
  cin>>x;
  if(x<a2+1||x%a2==0||x%a2==1)
    cout<<"Yes";
  else
    cout<<"No";
}