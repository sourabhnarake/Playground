#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,d=0;
  cin>>r;
  int a[r][r],b[(r*2)+1];
  for(i=0;i<r;i++)
    for(j=0;j<r;j++)
      cin>>a[i][j];
      
  for(i=0;i<r;i++)
  {
    b[i]=0;
    for(j=0;j<r;j++)
      b[i]+=a[i][j];
  }

  for(i=0;i<r;i++)
  {
    b[i+r]=0;
    for(j=0;j<r;j++)
      b[i+r]+=a[j][i];
  }
  
  b[r*2]=0;  
  for(i=0;i<r;i++)
    for(j=0;j<r;j++)
      if(i==j)
        b[r*2]+=a[i][j];

  for(j=0;j<(r*2)+1;j++)
    d+=b[j];
  if((d/((r*2)+1))==b[0])
    cout<<"Yes";
  else
    cout<<"No";
}