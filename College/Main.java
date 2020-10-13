#include <iostream>
struct student
{
  char name[100];
  char dep[100];
  int year;
  float cgpa;
};
int main() 
{
  int n,i;
  std::cout<<"Enter the number of colleges\n";
  std::cin>>n;
  student s[n];
  for(i=1;i<=n;i++)
  {
    std::cout<<"Enter the details of college "<<i;
    std::cout<<"\nEnter name\n";
    std::cin>>s[i].name;
    std::cout<<"Enter city\n";
    std::cin>>s[i].dep;
    std::cout<<"Enter year of establishment\n";
    std::cin>>s[i].year;
    std::cout<<"Enter pass percentage\n";
    std::cin>>s[i].cgpa;
  }
  std::cout<<"Details of colleges";
  for(i=1;i<=n;i++)
  {
    std::cout<<"\nCollege:"<<i;
    std::cout<<"\nName:"<<s[i].name;
    std::cout<<"\nCity:"<<s[i].dep;
    std::cout<<"\nYear of establishment:"<<s[i].year;
    std::cout<<"\nPass percentage:"<<s[i].cgpa;
  }
}