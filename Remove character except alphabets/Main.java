#include<iostream>
#include<string>
int main() 
{
  std::string a;
  std::cin>>a;
  for(int i=0;i<a.size();i++)
    for(int j=65;j<122;j++)
    {
      if(j>=91&&j<=96)
        continue;
      if(a[i]==j)
        std::cout<<a[i];
    }
}