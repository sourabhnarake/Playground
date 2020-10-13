#include<iostream>
int f(int a,int b)
{
  if(b == 0)
	{
		return 1;
	}
  b--;
  return a*f(a,b);
}
int main()
{
  int a,b;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>b;
  std::cout<<"The value of "<<a<<" power "<<b<<" is "<<f(a,b);
}