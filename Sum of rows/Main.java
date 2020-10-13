#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,d=0;
  cin>>r;
  cin>>c;
  int a[r][c],b[r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
      
  for(i=0;i<r;i++)
  {
    b[i]=0;
    for(j=0;j<c;j++)
      b[i]+=a[i][j];
    cout<<b[i]<<"\n";
  }
}