#include<iostream>
int f(int n,int a=0,int b=1)
{
  int s;
  if(n == 2)
	{
		return b;
	}
  s=a+b;
  a=b;
  b=s;
  return f(n-1,a,b);
}
int main()
{
  int a;
  std::cin>>a;
  std::cout<<"The term "<<a<<" in the fibonacci series is "<<f(a);
}