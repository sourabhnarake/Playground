#include<iostream>
#include<string>
int main() 
{
  int f=0,p=0;
  std::string a,b,c;
  std::cin>>a;
  std::cin>>b;
  for(auto i=a.crbegin();i<a.crend();i++)
  {
  if(b[f]==*i)
    f++;
  else
  {
    p=1;
    std::cout<<"It is wrong";
    break;
  }
  }
  if(p==0)
    std::cout<<"It is correct";
}