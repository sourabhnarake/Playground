#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
  if(a<=200)
    std::cout<<"Rs."<<int(a*0.5);
  else if(a<=400)
    std::cout<<"Rs."<<int((a*0.65)+100);
  else if(a<=600)
    std::cout<<"Rs."<<int((a*0.8)+200);
  else if(a>600)
    std::cout<<"Rs."<<int((a*1.25)+425);
}