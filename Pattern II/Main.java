#include <iostream>
using namespace std;
int main()
{
    int a,i,j,c=1,b=1,d,p;
    cin>>a;
    label:
        for(i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                c--;
                c=c+i;
                d=c;
                for(j=0;j<b;j++)
                {
                    cout<<d;
                    d--;
                    
                    if(p!=b-1)
                    {
                        cout<<"*";
                    }
                    p++;
                    
                }
                c++;
            }
            else
            {
                for(j=0;j<b;j++)
                {
                    cout<<c;
                    c++;
                    if(c==2)
                    {
                        continue;
                    }
                    else if(p!=b-1)
                    {
                        cout<<"*";
                    }        
                    p++;
                }
            }
            cout<<"\n";
            b++;
            p=0;
        }
}