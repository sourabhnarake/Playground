#include<iostream>
#include<string>
int main() 
{
  int f=0,p=0;
  std::string a,b,d;
  std::cin>>a;
  d=a;
  for(int j=0;j<100;j++)
  {
    std::cin>>b;
    if(a.back()==b.front())
    {
      if(p==0)
      {
       std::cout<<d;
       p=1;
      }
      std::cout<<"\n"<<b;
      a=b;
    }
    else if(b.front()==35)
      break;
    else
      break;
  }
}
