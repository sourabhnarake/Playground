#include<iostream>
int f(int a,int b,int c)
{
  if(b%a==0&&c%a==0)
	{
		return a;
	}
  a--;
  return f(a,b,c);
}
int main()
{
  int a,b,x,y;
  std::cin>>a;
  std::cin>>b;
  if(a<b)
  {
    x=a;
    y=b;
  }
  else
  {
    x=b;
    y=a;
  }
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<f(x,y,x);
}