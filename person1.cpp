#include<iostream>
#include<string.h>

using namespace std;

class person
{
 private:
 char name[20];int age;float height;

 public:
 void get_details(void);
 void set_details(char *string, int a, float h);
 void display_details(void);
};

void person::get_details(void)
{
cout<<"Enter your name:";
cin.get(name,20);

cout<<"Enter your age:";
cin>>age;

cout<<"Neter your height:";
cin>>height;
}

void person::set_details(char *string, int a, float h)
{
strcpy(name,string);
age=a;
height=h;
}

void person::display_details(void)
{
cout<<"Your name is "<<name<<"\n";
cout<<"Your age is "<<age<<"years\n";
cout<<"Your height is "<<height<<"cm\n";
}

int main(void)
{
person p1,p2;

p1.set_details("Sachin",40,170.21);
cout<<"The input in given from keyboard\n";
p2.get_details();
cout<<"Set the details\n";
p1.display_details();
cout<<"\n";
cout<<"Displaying details of 2nd user\n";
//cout<<"\n";
p2.display_details();
return 0;
}
