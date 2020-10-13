#include<iostream>
using namespace std;
int stockSpan(int n, int *a)
{
  int i,e=0,o=0,m=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e+=1;
    else
      o+=1;
  }
  if(o==0)
    return 1;
  else if(e==0)
    return 2;
  return 3;
}
int main()
{
  int n,i,d;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  d=stockSpan(n,a);
  if(d==1)
    cout<<"The array is Even";
  else if(d==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}