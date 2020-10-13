#include <iostream>
int main()
{
  int a,i,b,d,c,f,g,e;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  std::cin>>d;
  f=b+d;
  i=f/100;
  g=f%100;
  e=a+c+i;
  std::cout<<e<<"\n";
  std::cout<<g;
}