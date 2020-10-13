#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;
  cin>>e;
  cin>>f;
  cin>>g;
  if(b+c+d+e+f<=40){
    a=(a*100)+(a*50);
    if(b<=8)
      b=b*100;
    else
      b=((b-8)*15)+b*100;
    if(c<=8)
      c=c*100;
    else
      c=((c-8)*15)+c*100;
    if(d<=8)
      d=d*100;
    else
      d=((d-8)*15)+d*100;
    if(e<=8)
      e=e*100;
    else
      e=((e-8)*15)+e*100;
    if(f<=8)
      f=f*100;
    else
      f=((f-8)*15)+f*100;
    g=(g*100)+(g*25);
   cout<<a+b+c+d+e+f+g;
  }
  }