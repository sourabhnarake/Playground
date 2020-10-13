#include <iostream>
struct diff
{
  int f;
  float i;
};
int main() 
{
  diff n1,n2,a;
  std::cin>>n1.f;
  std::cin>>n1.i;
  std::cin>>n2.f;
  std::cin>>n2.i;
  a.i=n1.i+n2.i;
  if(a.i>=12)
  {
    n1.f+=1;
    a.i-=12;
  }
  a.f=n1.f+n2.f;
  std::cout<<a.f<<"'-"<<a.i<<"\"";
}