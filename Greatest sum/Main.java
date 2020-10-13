#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,d=0,p=1,q;
  cin>>r;
  cin>>c;
  int a[r][c],b[r],m[c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
      
  for(i=0;i<r;i++)
  {
    b[i]=0;
    for(j=0;j<c;j++)
      b[i]+=a[i][j];
  }

  for(i=0;i<r;i++)
  {
    m[i]=0;
    for(j=0;j<c;j++)
      m[i]+=a[j][i];
  }
  
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
    cout<<b[i]<<" ";
  cout<<"\n";
  
  d=b[0];
  for(j=0;j<r-1;j++)
  {
    if(d>=b[j+1])
      break;
    else
    {
      d=b[j+1];
      p++;
    }
  }
  cout<<"Row "<<p<<" has maximum sum\n";  
  
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
    cout<<m[i]<<" ";
  cout<<"\n";
  
  p=1;
  d=m[0];
  for(j=0;j<c-1;j++)
  {
    if(d>=m[j+1])
      break;
    else
    {
      d=m[j+1];
      p++;
    }
  }
  cout<<"Column "<<p<<" has maximum sum";
}