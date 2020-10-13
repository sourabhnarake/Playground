#include<iostream>
using namespace std;
int main()
{
  int n,p,e,b=0,i,j;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>p;
  p=p-1;
  if(p>n)
    cout<<"\nInvalid Input";
  else
  {
    cout<<"\nEnter the value to insert";
    cin>>e;
    cout<<"\nArray after insertion is\n";
    for(i=0;i<n;i++)
    {
      if(i==p)
        cout<<e<<"\n"<<a[i]<<"\n";
      else
        cout<<a[i]<<"\n";
    }
  }
}