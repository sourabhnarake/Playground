#include<iostream>
int main()
{
  int a,b,c;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  if(c>=a&&c<=a+b)
    std::cout<<"It is a mango tree";
  else if(c<=(a*b)-a&&c>(a*b)-(a+b))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}