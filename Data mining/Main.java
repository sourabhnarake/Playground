#include <iostream>
int main()
{
  int a,i,j=0,b,m=0,p,d,k;
  float l,c,r;
  std::cin>>a;
  for(i=a;i>0;i)
  {
    b=i%10;
    i=i/10;
    if(b%2==0)
      j=j+b;
    else
      m=m+b;
  }
  if(j==m)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}