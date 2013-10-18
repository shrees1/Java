#include<iostream>
#include<stdlib.h>
#define PI 3.14

using namespace std;

class Figure
{
 private:
 int res,x,y;
 float f,result;

 public:
 int calc(int);
 int calc(int,int);
 int calc(float);
 void display(float);
};

int Figure::calc(int a)
{
  x=a;
  y=a;

  res=x*y;
  display(res);
}

int Figure::calc(int a, int b)
{
  x=a;
  y=b;

  res=x*y;
  display(res);
}

int Figure::calc(float p)
{
  f=p;

  result=PI*f*f;
  display(result);
}

void Figure::display(float m)
{
 cout<<"The Result of Calculation is :"<<m<<"\n";
}


int main()
{
 Figure fig;
 int a,b,n;
 float p;
 cout<<"Select any one :\n";
 while(1)
 {

 cout<<"\n\n1. Square.\n2. Rectangle.\n3. Circle.\n4. Exit.\n";
 cout<<"Enter an option : ";
 cin>>n;
 if (n==1)
 {
   cout<<"You have choosen : Square\n";
 }

 if (n==2)
 {
     cout<<"You have choosen : Rectangle\n";
 }

 if(n==3)
 {
     cout<<"You have choosen : Circle\n";
 }

 switch(n)
 {

  case 1:
  {
   cout<<"Enter the side of a Square : ";
   cin>>a;
   fig.calc(a);
   break;
  }

   case 2:
  {
   cout<<"Enter the lenght of a Rectangle : ";
   cin>>a;
   cout<<"Enter the breadht of a Rectangle : ";
   cin>>b;
   fig.calc(a,b);
   break;
  }

  case 3:
  {
   cout<<"Enter the radius of a circle : ";
   cin>>p;
   fig.calc(p);
   break;
  }

  case 4:
  {
   cout<<"You are now exiting the Program :)";
   exit(0);
  }

  default:
  {
   cout<<"You have entered a wrong option Please try again \n";
  }

  }
 }
}
