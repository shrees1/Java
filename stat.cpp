#include<iostream>

using namespace std;

class shared
{
 //public:
 static int a;
 int b;

 public:
 void set_data(int x,int y){a=x;b=y;}
 void show();
};

int shared::a;

void shared::show()
{
 cout<<"\nThe static a:"<<a<<"\n";
 cout<<"The variable b:"<<b<<"\n";
}

int main()
{
shared l,m;
l.set_data(1,1);
l.show();

m.set_data(2,2);
m.show();

l.show();
//m.show();

return 0;
}
