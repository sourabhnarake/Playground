#include <iostream>
using namespace std;
int main()
{
    int a,i,j,c=1,p=4;
    cin>>a;
    label:
        for(i=0;i<p;i++)
        {
            for(j=0;j<c;j++)
                cout<<a;
            cout<<"\n";
            if(p==8)
            {
                c--;
                if(c==0)
                    break;
                a--;
                goto label;
            }
            if(c==4)
            {
                p=8;
                goto label;
            }
            c++;
            a++;
        }
}