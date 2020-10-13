#include <iostream>
int main()
{
  int a,i,j;
  std::cin>>a;
  std::cout<<a<<"\n";
  for(i=a;i>1;i)
  {
    if(i%2==0)
    {
      i=i/2;
      if(i==1)
      {
        std::cout<<i<<"\n";
        j++;
        break;
      }
    }
    else
      i=(3*i+1);
    std::cout<<i<<"\n";
    j++;
  }
  std::cout<<j;
}