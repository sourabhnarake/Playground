#include <iostream>
struct student
{
  char name[20];
  int id;
  int age;
  char deg[20];
  int sal;
};
int main() 
{
  int i;
  student s;
  std::cout<<"Enter name:\n";
  std::cin>>s.name;
  std::cout<<"Enter ID:\n";
  std::cin>>s.id;
  std::cout<<"Enter age:\n";
  std::cin>>s.age;
  std::cout<<"Enter designation:\n";
  std::cin>>s.deg;
  std::cout<<"Enter Salary:\n";
  std::cin>>s.sal;  
  std::cout<<"Employee Details";
  std::cout<<"\nName of the Employee : "<<s.name;
  std::cout<<"\nID of the Employee : "<<s.id;
  std::cout<<"\nAge of the Employee : "<<s.age;
  std::cout<<"\nDesignation of the Employee : "<<s.deg;
  std::cout<<"\nSalary of the Employee : "<<s.sal;
}