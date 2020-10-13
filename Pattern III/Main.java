#include <iostream>
using namespace std;
int main()
{
    int a,i,j,c=1,l=1;
    cin>>a;
    int p=a;
    label:
        for(i=0;i<p;i++)
        {
            for(j=0;j<c;j++)
            {
              cout<<l;
              if(j+1<c)
              {
                cout<<"*";
              }
            }
          
            cout<<"\n";
            if(p==a*2)
            {
                c--;
                if(c==0)
                    break;
                l--;
                goto label;
            }
            if(l==a)
            {
                p=a*2;
                goto label;
            }
            c++;
            l++;
        }
}