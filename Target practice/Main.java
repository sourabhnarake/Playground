#include<iostream>
using namespace std;
int main()
{
  int a,b,j,k=0,i=1,p=0;
  std::cin>>b;
  for(j=0;j<1000;j++)
  {
    std::cin>>a;
    p=p+a;
    if(b<=p)
      break;
    else
      i++;
  }
  std::cout<<"The number of turns is "<<i;
}