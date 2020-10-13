#include<iostream>
using namespace std;
int main()
{
  int a,i,b=-2,c=2,j,k=0;
  cin>>a;
  for(i=0;i<a;i++)
  {
    for(j=0;j<2;j++)
    {
      b=b+c;
      cout<<b<<" ";
      k++;
      if(k==a)
        break;
    }
    c=c+4;
    if(k==a)
      break;
  }
}