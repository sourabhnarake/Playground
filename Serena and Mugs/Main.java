#include<iostream>
using namespace std;
int main()
{
  int n,c,b=0,i;
  cin>>n>>c;
  //cout<<n<<c;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
    b=b+a[i];
  if(b<=c)
    cout<<"YES";
  else
    cout<<"NO";
}