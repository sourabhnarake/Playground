#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3;
  cin>>a1;
  cin>>a2;
  cin>>a3;
  if(a1>a2)
    if(a1>a3)
      if(a2>a3)
        cout<<"The treasure is in box which has number "<<a2;
	  else
        cout<<"The treasure is in box which has number "<<a3;
    else
        cout<<"The treasure is in box which has number "<<a1;
  else if(a2>a3)
    if(a2>a1)
      if(a3>a1)
        cout<<"The treasure is in box which has number "<<a3;
	  else
        cout<<"The treasure is in box which has number "<<a1;
    else
        cout<<"The treasure is in box which has number "<<a2;
  else
    if(a3>a2)
      if(a1>a1)
        cout<<"The treasure is in box which has number "<<a1;
	  else
        cout<<"The treasure is in box which has number "<<a2;
    else
        cout<<"The treasure is in box which has number "<<a3;
  cout<<"\n";
  if(a2%a1==0&&a3%a1==0)
        cout<<"The code to open the box is "<<a1;
  else if(a1%a2==0&&a3%a2==0)
        cout<<"The code to open the box is "<<a2;
  else if(a1%a3==0&&a2%a3==0)
        cout<<"The code to open the box is "<<a3;
  else
        cout<<"The code to open the box is 1";  
}