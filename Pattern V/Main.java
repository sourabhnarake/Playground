#include<iostream>
using namespace std;
int main()
{
	int a,i,j,l=1,k,t=2,d,m=0,p,v,s;
	cin>>a;
	d=a;
	p=a*(a+1);
	for(i=0;i<a;i++)
	{
		label:
			for(k=0;k<d;k++)
			{
				if(m==1)
				{
					cout<<p;
					p++;				
					if(k==d-1)
					{
						p=v-1;
						break;					
					}
					cout<<"*";
					continue;					
				}
				cout<<l<<"*";
				l++;
				if(k==d-1)
				{
					m=1;
					p=p-k;
					v=p;
					goto label;
				}
		    }
		d--;
		m=0;
		cout<<"\n";
		for(s=0;s<=i;s++)
			if(i!=a-1)
				cout<<"--";
	}
}
