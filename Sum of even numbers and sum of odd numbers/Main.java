#include<iostream>
using namespace std;
int main()
{
  int n,c=0,b=0,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      b+=a[i];
    else
      c+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<b;
  cout<<"\nThe sum of the odd numbers in the array is "<<c;
}