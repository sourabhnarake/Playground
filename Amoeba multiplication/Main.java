#include <iostream>
int main()
{
  int a=0,b=1,i,n,s;
  std::cin>>n;
  for(i=3;i<50;i++)
  {
    s=a+b;
    if(n==i)
    {
      std::cout<<s;
      break;
    }
    a=b;
    b=s;
  }
}