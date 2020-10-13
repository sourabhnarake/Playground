#include <iostream>
int main()
{
  int a,j,k=0;
  float i=0;
  for(j=0;j<1000;j++)
  {
    std::cin>>a;
    if(a<0)
    {
      i=i-1;
      break;
    }
    else if(a%2==0)
      i=i-0.5;
    else
    {
      i++;
      k++;
    }
    if(k==3)
      break;
  }
  printf("%.1f",i);
}