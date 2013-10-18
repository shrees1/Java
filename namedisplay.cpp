#include<iostream>

using namespace std;

class Name
{
 private:
 int x,y;
 public:
 void setting(int ,int);
 int display();
};

void Name::setting(int a, int b)
{
 x=a;
 y=b;
}

int Name::display()
{
 return x+y;
}

int main()
{
 Name nam;
 nam.setting(4,5);
 cout<<"The send no. is:" << nam.display();
 return 0;
}

