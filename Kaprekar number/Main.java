#include <iostream>
int main()
{
  int a,i,j=0,b,m=0,p,d,k;
  float l,c,r;
  std::cin>>a;
  b=a*a;
  c=a*a;
  for(i=a;i>0;i)
  {
    i=i/10;
    j++;   
  }
  for(i=b;i>0;i)
  {
    i=i/10;
    m++;
  }
  p=m-j;
  for(i=0;i<p;i++)
    b=b/10;
  for(i=0;i<j;i++)
    c=c/10;
  d=c;
  r=c-d;
  for(i=0;i<j;i++)
    r=r*10;
  k=b+r;
  if(a==k)
    std::cout<<"Kaprekar Number";
  else
    std::cout<<"Not a Kaprekar Number";
}