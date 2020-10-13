#include<iostream>
using namespace std;
int main()
{
  float a1,a2,a3;
  cin>>a1;
  cin>>a2;
  if(a1>13)
    if(a2>=13.30)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  else if(a1<=13)
    if(a2>=13.30)
      cout<<"$2.00";
    else
      cout<<"$4.00";

}