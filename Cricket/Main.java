#include <iostream>
using namespace std; 
int main()
{
   int tb,tr,cr,cb;
   cin>>tb;
   cin>>tr;
   cin>>cr;
   cin>>cb;
   float t6=tb/6;
   int t=cb/6;
   int p=cb%6;
   float c6=(float(t)+(float(p)/10));
   float crr=cr/c6;
   float trr=tr/t6;
   cout<<t6<<"\n"<<c6<<"\n";
   printf("%.1f", crr);
   cout<<"\n";
   printf("%.1f", trr);
   if(crr>trr)
     cout<<"\nEligible to Win";
   else
     cout<<"\nNot Eligible to Win";
}