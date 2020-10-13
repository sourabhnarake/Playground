#include<iostream>
int main()
{
  int a,b,c;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  if(a>((75*b)+(30*c)))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}