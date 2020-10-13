#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,d=0,p,q;
  cin>>r;
  cin>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
      
  for(i=0;i<1;i++)
  {
    d=0;
    for(j=0;j<c;j++)
      d+=a[i][j];
    for(p=i+1,q=j-=2;p<r;p++)
    {
      d+=a[p][q];
      q--;
    }
    for(q=q+2;q<c;q++)
      d+=a[p-1][q];
    cout<<"Sum of Zig-Zag pattern is "<<d;
  }
}