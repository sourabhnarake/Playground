#include <iostream>
int main()
{
  int a,i,r,s=0;
  std::cin>>a;
  for(i=a;i>=1;i)
  {
    r=i%10;
    i=i/10;
    s=s+r;
  }
  if(a%s==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number"; 
}