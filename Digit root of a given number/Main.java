#include<iostream>
int f(int a)
{
  int r;
  if(a<=9)
	{
		return a;
	}
  r=a%10;
  a=a/10;
  a=a+r;
  return f(a);
}
int main()
{
  int a;
  std::cin>>a;
  std::cout<<f(a);
}