#include<iostream>
using namespace std;
int main()
{
	int a,i,j,c=1,l=1,k;
	cin>>a;
	label:
		for(i=0;i<a;i++)
		{
			for(k=0;k<a-1;k++)
			{
				if(i%2==0)
					cout<<l;
			}
			l++;
			cout<<l;
			if(i%2!=0)
			{
				l--;
				for(k=0;k<a-1;k++)
					cout<<l;
				l++;
			}
			cout<<"\n";
		}
}
