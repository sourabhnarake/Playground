#include<iostream>
#include<string>
int main() 
{
  int f;
  std::string a;
  std::getline(std::cin,a);
  f=a.find("the");
  //std::cout<<f;
  a.erase(a.begin()+f,a.begin()+f+4);
  f=a.find("the",9);
  a.erase(a.begin()+f,a.begin()+f+4);
  std::cout<<a;
}
