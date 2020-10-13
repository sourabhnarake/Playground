#include <iostream>
struct diff
{
  int h;
  int m;
  int s;
};
int main() 
{
  int i;
  diff n1,n2,a;
  std::cin>>n1.h;
  std::cin>>n1.m;
  std::cin>>n1.s;
  std::cin>>n2.h;
  std::cin>>n2.m;
  std::cin>>n2.s;
  a.s=n1.s-n2.s;
  if(a.s<0)
  {
    a.s+=60;
    n2.m+=1;
  }
  a.m=n1.m-n2.m;
  if(a.m<0)
  {
    a.m+=60;
    n2.h+=1;
  }
  a.h=n1.h-n2.h;
  std::cout<<a.h<<":"<<a.m<<":"<<a.s;
}