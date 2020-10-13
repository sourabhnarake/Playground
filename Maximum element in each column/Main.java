#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,d;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<c;i++)
  {
    d=a[0][i];
    for(j=0;j<r-1;j++)
    {
      if(d>a[j+1][i])
        d=a[j][i];
      else
        d=a[j+1][i];
    }
    cout<<d<<"\n";
  }
}