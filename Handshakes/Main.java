#include <iostream>
int main()
{
  int a,b=0,i;
  std::cin>>a;
  for(int i=a-1;i>0;i--)
    b=b+i;
  std::cout<<b;
}