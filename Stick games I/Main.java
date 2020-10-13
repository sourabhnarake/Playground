#include<iostream>
using namespace std;
int main()
{
  int a,b,i;
  cin>>a>>b;
  for(i=0;i<10;i++)
  {
    a-=1;
    b-=1;
    if(a==0||b==0)
    {
      if(i%2==0)
        cout<<"Arun Gupta";
      else
        cout<<"Mani Iyer";
      break;
    }
  }
}