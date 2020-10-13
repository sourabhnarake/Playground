
#include<iostream>
#include<string>
int main() 
{
  int v=0,c=0,w=0,d=0,s=0;
  std::string a;
  std::getline(std::cin,a);
  for(int i=0;i<a.size();i++)
  {
    if(a[i]==65||a[i]==69||a[i]==73||a[i]==79||a[i]==85||a[i]==97||a[i]==101||a[i]==105||a[i]==111||a[i]==117)
      v+=1;
    else if(a[i]==32)
      w+=1;
    else if(a[i]>=48&&a[i]<=57)
      d+=1;
    else if((a[i]>=33&&a[i]<=47)||(a[i]>=58&&a[i]<=64)||(a[i]>=91&&a[i]<=96)||(a[i]>=123&&a[i]<=126))
      s+=1;
    else
      c+=1;
  }
  std::cout<<"Vowels:"<<v;
  std::cout<<"\nConsonants:"<<c;
  std::cout<<"\nWhite Spaces:"<<w;
  std::cout<<"\nDigits:"<<d;
  std::cout<<"\nSymbols:"<<s;
}